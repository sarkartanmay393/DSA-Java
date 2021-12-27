package com.tanmay.Sorting;

import java.util.Arrays;

public class IntertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1,0};
        //intertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }



    static void swap(int[] arr, int firstIdx, int secondIdx) {
        int temp = arr[firstIdx];
        arr[firstIdx] =  arr[secondIdx];
        arr[secondIdx] = temp;
    }

}