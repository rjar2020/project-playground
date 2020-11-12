package com.projectg.sort

object RecursiveBubbleSort {

    @JvmStatic
    fun sortAscending(arrayToSort: IntArray): IntArray {
        val sortedArray = arrayToSort.copyOf()
        sortAscending(sortedArray, arrayToSort.size)
        return sortedArray;
    }

    @JvmStatic
    fun sortDescending(arrayToSort: IntArray): IntArray {
        val sortedArray = arrayToSort.copyOf()
        sortDescending(sortedArray, arrayToSort.size)
        return sortedArray;
    }

    private tailrec fun sortAscending(arrayToSort: IntArray, arraySize: Int) {
        if(arraySize == 1) return;

        var swapped = false
        for (i in 0 until arraySize - 1) {
            if (arrayToSort[i] > arrayToSort[i+1]) {
                val aux = arrayToSort[i]
                arrayToSort[i] = arrayToSort[i+1]
                arrayToSort[i+1] = aux
                swapped = true
            }
        }

        if (swapped) sortAscending(arrayToSort, arraySize - 1)
    }

    private tailrec fun sortDescending(arrayToSort: IntArray, arraySize: Int) {
        if(arraySize == 1) return;

        var swapped = false
        for (i in 0 until arraySize - 1) {
            if (arrayToSort[i] < arrayToSort[i+1]) {
                val aux = arrayToSort[i]
                arrayToSort[i] = arrayToSort[i+1]
                arrayToSort[i+1] = aux
                swapped = true
            }
        }

        if(swapped) sortDescending(arrayToSort, arraySize - 1)
    }
}