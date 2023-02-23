function main() {
    // var unsorted = [12, 11];
    //  var unsorted = [12, 11, 13, 5, 6, 7 ];
    var unsorted = [12, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 11, 13, 5, 6, 7, 0, 2, -1];
	
    sort(unsorted);

    console.log(unsorted);
}

function sort(unsorted) {
    for(let i = 0; i < unsorted.length; i++) {
        for(let j = 0; j < unsorted.length - 1; j++) {
            let currNum = unsorted[j];
            let nextNum = unsorted[j + 1];
            if(nextNum <= currNum) {
                let temp = currNum;
                unsorted[j] = nextNum;
                unsorted[j + 1] = temp;
            }
        }
    }
}

main();