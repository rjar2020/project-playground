package com.projectg.search

object RecursiveBinarySearch {

    @JvmStatic
    fun search(sortedArray: IntArray, element: Int) : Int {
        if(sortedArray.isEmpty()) return -1
        return search(sortedArray, element, 0, sortedArray.size - 1);
    }

    private tailrec fun search(sortedArray: IntArray, element: Int, left: Int, right: Int) : Int =
        when {
            right <= left -> if(sortedArray[left] == element) left else -1
            else -> {
                val mid = (left + right - 1) / 2
                when {
                    sortedArray[mid] == element -> mid
                    sortedArray[mid] > element -> search(sortedArray, element, left, mid - 1)
                    else -> search(sortedArray, element, mid + 1, right)
                }
            }
        }
}