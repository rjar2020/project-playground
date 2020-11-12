package com.projectg.sort;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.projectg.UtilSortTest.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortShould {

    @Test
    void order_array_ascending() {
        var arrayToSort = getRandomIntArray();
        var expectedSortedResult = getAscendingSortedIntArray(arrayToSort);
        assertArrayEquals(expectedSortedResult, RecursiveQuickSort.sortAscending(arrayToSort));
        assertArrayEquals(expectedSortedResult, RecursiveBubbleSort.sortAscending(arrayToSort));
    }

    @Disabled
    @Test
    void order_array_descending() {
        int[] arrayToSort = getRandomIntArray();
        int[] expectedSortedResult = getDescendingOrderIntArray(arrayToSort);
        assertArrayEquals(expectedSortedResult, RecursiveQuickSort.sortDescending(arrayToSort));
        assertArrayEquals(expectedSortedResult, RecursiveBubbleSort.sortDescending(arrayToSort));
    }
}
