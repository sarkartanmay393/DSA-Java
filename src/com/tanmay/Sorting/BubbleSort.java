package com.tanmay.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
        }
    }

    static void swap(int[] arr, int firstIdx, int secondIdx) {
        int temp = arr[firstIdx];
        arr[firstIdx] =  arr[secondIdx];
        arr[secondIdx] = temp;
    }
}
