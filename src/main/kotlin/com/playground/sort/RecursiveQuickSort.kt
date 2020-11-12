package com.playground.sort


object RecursiveQuickSort {

    @JvmStatic
    fun sortAscending(arrayToSort: IntArray): IntArray {
        val sortedArray = arrayToSort.copyOf()
        optimisedSortAscending(sortedArray)
        return sortedArray;
    }

    @JvmStatic
    fun sortDescending(arrayToSort: IntArray): IntArray {
        return arrayToSort.copyOf();
    }

    private fun optimisedSortAscending(arrayToSort: IntArray, low: Int = 0, high: Int = arrayToSort.size - 1) {
        var lowBound = low
        while (lowBound < high) {
            /* pi is partitioning index, arr[p] is now
           at right place */
            val pi = partition(arrayToSort, lowBound, high)

            // Separately sort elements before
            // partition and after partition
            optimisedSortAscending(arrayToSort, lowBound, pi - 1)
            lowBound = pi + 1
        }
    }

    private fun partition(arr: IntArray, low: Int, high: Int): Int {
        // using latest element as pivot
        val pivot = arr[high]
        var i = low - 1 // index of smaller element
        for (j in low until high) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++
                // swap arr[i] and arr[j]
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp
        return i + 1
    }
}