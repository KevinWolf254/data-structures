var main = () => {
    // var unsorted = [12, 11];
    //  var unsorted = [12, 11, 13, 5, 6, 7 ];
    var unsorted = [12, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 0, 2, -1];
	
    mergeSort(unsorted);

    console.log(unsorted);
};

var mergeSort = (unsorted) => {
    sort(unsorted, 0, unsorted.length - 1);
}

var sort = (unsorted, lIndex, rIndex) => {
    if(lIndex >= rIndex)
        return;

    let mIndex = lIndex + parseInt((rIndex - lIndex) / 2);

    sort(unsorted, lIndex, mIndex);
    sort(unsorted, mIndex + 1, rIndex);

    merge(unsorted, lIndex, mIndex, rIndex);
}

var merge = (unsorted, lIndex, mIndex, rIndex) => {
    let lSize = mIndex - lIndex + 1;
    let rSize = rIndex - mIndex;

    let lUnsorted = [];//new Array(lSize);
    let rUnsorted = [];//new Array(rSize);

    for(let i = 0; i < lSize; ++i) {
        lUnsorted[i] = unsorted[lIndex + i];
    }
    for(let j = 0; j < rSize; ++j) {
        rUnsorted[j] = unsorted[mIndex + 1 + j];
    }

    let tmpLIndex = 0, tmpRIndex = 0, tmpMainIndex = lIndex;

    while(tmpLIndex < lSize && tmpRIndex < rSize) {
        let lNum = lUnsorted[tmpLIndex];
        let rNum = rUnsorted[tmpRIndex];

        if(lNum <= rNum) {
            unsorted[tmpMainIndex] = lNum;
            tmpLIndex++;
        } else {
            unsorted[tmpMainIndex] = rNum;
            tmpRIndex++;
        }
        tmpMainIndex++;
    }

    while(tmpLIndex < lSize) {
        unsorted[tmpMainIndex] = lUnsorted[tmpLIndex];
        tmpLIndex++;
        tmpMainIndex++;
    }

    while(tmpRIndex < rSize) {
        unsorted[tmpMainIndex] = rUnsorted[tmpRIndex];
        tmpRIndex++;
        tmpMainIndex++;
    }
}

main();