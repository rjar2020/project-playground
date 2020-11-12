package com.projectg.sort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] sortAscending(int[] arrayToSort) {
        var sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        for (var i = 0; i < sortedArray.length - 1; i++) {
            for (var j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < sortedArray[i]) {
                    var aux = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = aux;
                }
            }
        }
        return sortedArray;
    }

    public static int[] sortDescending(int[] arrayToSort) {
        var sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        for (var i = 0; i < sortedArray.length - 1; i++) {
            for (var j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] > sortedArray[i]) {
                    var aux = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = aux;
                }
            }
        }
        return sortedArray;
    }
}
