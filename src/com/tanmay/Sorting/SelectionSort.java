package com.tanmay.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0,-1,1,-2,2,-3,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int lastUnprocessedIndex = arr.length - 1 - i;
            swap(arr, getCurrentMax(arr, lastUnprocessedIndex), lastUnprocessedIndex);
        }
    }

    static int getCurrentMax(int[] arr, int lastUnprocessedIndex) {
        int maxIndex = 0;
        for (int i = 0; i <= lastUnprocessedIndex; i++) {
            if(arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
