package com.projectg.sort;

import java.util.Arrays;

public final class SelectionSort {

    private SelectionSort(){}

    public static int[] sortAscending(int[] arrayToSort) {
        var sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        for(var i = 0; i < sortedArray.length - 1; i++) {
            var minIndex = i;
            for (var j = i+1; j < sortedArray.length; j++) {
                if(sortedArray[j] < sortedArray[minIndex]) {
                    minIndex = j;
                }
            }
            var min = sortedArray[minIndex];
            sortedArray[minIndex] = sortedArray[i];
            sortedArray[i] = min;
        }
        return sortedArray;
    }

    public static int[] sortDescending(int[] arrayToSort) {
        var sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        for(var i = 0; i < sortedArray.length - 1; i++) {
            var minIndex = i;
            for (var j = i+1; j < sortedArray.length; j++) {
                if(sortedArray[j] > sortedArray[minIndex]) {
                    minIndex = j;
                }
            }
            var max = sortedArray[minIndex];
            sortedArray[minIndex] = sortedArray[i];
            sortedArray[i] = max;
        }
        return sortedArray;
    }
}
