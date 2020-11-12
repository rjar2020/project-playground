package com.projectg.sort;


import org.junit.jupiter.api.Test;

import static com.projectg.UtilSortTest.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortShould {

    @Test
    void order_array_ascending() {
        var arrayToSort = getRandomIntArray();
        var expectedSortedResult = getAscendingSortedIntArray(arrayToSort);
        assertArrayEquals(expectedSortedResult, BubbleSort.sortAscending(arrayToSort));
        assertArrayEquals(expectedSortedResult, RecursiveBubbleSort.sortAscending(arrayToSort));
    }

    @Test
    void order_array_descending() {
        int[] arrayToSort = getRandomIntArray();
        int[] expectedSortedResult = getDescendingOrderIntArray(arrayToSort);
        assertArrayEquals(expectedSortedResult, BubbleSort.sortDescending(arrayToSort));
        assertArrayEquals(expectedSortedResult, RecursiveBubbleSort.sortDescending(arrayToSort));
    }
}
