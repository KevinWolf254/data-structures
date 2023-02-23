package sorting.java;

public class BubbleSort {

	public static void main(String[] args) {
//		int unsorted[] = { 12, 11, 13, 5, 6, 7 };
		int unsorted[] = { 12, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 0, 2, -1};
		
		sort(unsorted);
		
		for(int num : unsorted) {
			System.out.print(num);
			System.out.print(", ");
		}
	}

	private static void sort(int[] unsorted) {
		// swap the next element if its smaller than the current
		for(int i = 0; i < unsorted.length; i++) {
			for(int j = 0; j < unsorted.length - 1; j++) {
				int currNum = unsorted[j];
				int nextNum = unsorted[j + 1];
				if(nextNum <= currNum) {
					int temp = currNum;
					unsorted[j] = nextNum;
					unsorted[j + 1] = temp;
				}
			}
		}
	}
}
