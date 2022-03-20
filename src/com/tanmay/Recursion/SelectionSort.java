package com.tanmay.Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 7, 8,9 ,0};
        selections_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selections_sort(int[] arr) {

        int max = 0;
        selection(arr, arr.length, 0, max);
    }
    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c+1, c); //
            } else {
                selection(arr, r, c+1, max); // 1
            }
        } else { //
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }

}
