package com.projectg.search;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static com.projectg.UtilSortTest.getAscendingSortedIntArray;
import static com.projectg.UtilSortTest.getRandomIntArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchShould {

    @Test
    void find_an_existing_element_index() {
        for(var i =0; i < 5_000; i++) {
            var sortedArray = getAscendingSortedIntArray(getRandomIntArray());
            var resultIndex = Math.abs(new Random().nextInt(sortedArray.length - 2));
            var elementToSearch = sortedArray[resultIndex];
            var elementFound = sortedArray[RecursiveBinarySearch.search(sortedArray, elementToSearch)];
            assertEquals(elementToSearch, elementFound, "Array size: " + sortedArray.length);
        }
    }

    @Test
    void return_minus_one_when_element_not_found() {
        var sortedArray = getAscendingSortedIntArray(getRandomIntArray());
        assertEquals(-1, RecursiveBinarySearch.search(sortedArray, 1_000_002));
    }
}
