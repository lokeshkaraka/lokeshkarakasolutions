function descendingSort(arr) {
    var len = arr.length;
    for (var i = 0; i < len - 1; i++) {
        for (var j = 0; j < len - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                
                var temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

var inputArray = [4, 2, 9, 1, 5];
descendingSort(inputArray);


console.log(inputArray);