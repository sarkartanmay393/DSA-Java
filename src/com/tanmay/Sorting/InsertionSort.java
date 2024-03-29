package com.tanmay.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1,0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                } else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int firstIdx, int secondIdx) {
        int temp = arr[firstIdx];
        arr[firstIdx] =  arr[secondIdx];
        arr[secondIdx] = temp;
    }

}