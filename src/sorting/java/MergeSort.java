package sorting.java;

public class MergeSort {

	public static void main(String[] args) {
//		int unsorted[] = { 12, 11, 13, 5, 6, 7 };
		int unsorted[] = { 12, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 0, 2, -1};
		
		mergeSort(unsorted);
		
		for(int num : unsorted) {
			System.out.print(num);
			System.out.print(", ");
		}
	}
	
	public static void mergeSort(int[] unsorted) {
		sort(unsorted, 0, unsorted.length - 1);		
	}
	
	public static void sort(int[] unsorted, int lIndex, int rIndex) {
		if(lIndex >= rIndex)
			return;
		
		// calculate mid
		int mIndex = lIndex + (rIndex - lIndex) / 2;
		
		sort(unsorted, lIndex, mIndex);
		sort(unsorted, mIndex + 1, rIndex);
		
		merge(unsorted, lIndex, mIndex, rIndex);
	}

	private static void merge(int[] unsorted, int lIndex, int mIndex, int rIndex) {
		
		int lSize = mIndex - lIndex + 1;
		int rSize = rIndex - mIndex;
		
		int[] lUnsorted = new int[lSize];
		int[] rUnsorted = new int[rSize];
		
		for(int i = 0; i < lSize; ++i) {
			lUnsorted[i] = unsorted[lIndex + i];
		}
		for(int i = 0; i < rSize; ++i) {
			rUnsorted[i] = unsorted[mIndex + 1 + i];
		}
		
		int tempLIndex = 0, tempRIndex = 0, tempMainIndex = lIndex;
		
		while(tempLIndex < lSize && tempRIndex < rSize) {
			int lNum = lUnsorted[tempLIndex];
			int rNum = rUnsorted[tempRIndex];
			
			if(lNum <= rNum) {
				unsorted[tempMainIndex] = lNum;
				tempLIndex++;
			} else {
				unsorted[tempMainIndex] = rNum;
				tempRIndex++;
			}
			tempMainIndex++;
		}
		
		while(tempLIndex < lSize) {
			unsorted[tempMainIndex] = lUnsorted[tempLIndex];
			tempLIndex++;
			tempMainIndex++;
		}
		
		while(tempRIndex < rSize) {
			unsorted[tempMainIndex] = rUnsorted[tempRIndex];
			tempRIndex++;
			tempMainIndex++;
		}
		
	}
}
