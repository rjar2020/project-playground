package com.projectg.sort;


import org.junit.jupiter.api.Test;

import static com.projectg.UtilSortTest.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortShould {

    @Test
    void order_array_ascending() {
        var arrayToSort = getRandomIntArray();
        var expectedSortedResult = getAscendingSortedIntArray(arrayToSort);
        assertArrayEquals(expectedSortedResult, SelectionSort.sortAscending(arrayToSort));
    }

    @Test
    void order_array_descending() {
        int[] arrayToSort = getRandomIntArray();
        int[] expectedSortedResult = getDescendingOrderIntArray(arrayToSort);
        assertArrayEquals(expectedSortedResult, SelectionSort.sortDescending(arrayToSort));
    }
}
