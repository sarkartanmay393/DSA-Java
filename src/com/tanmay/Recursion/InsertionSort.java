package com.tanmay.Recursion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {0,-3,-2,-1};
        Insertion(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void Insertion(int[] arr, int n) {
        if(n <= 1)
            return;
            // base

        Insertion(arr, n-1); // recursive call.

        int lastEle = arr[n-1];
        int i = n-2;

        while(i >= 0 && arr[i] > lastEle){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = lastEle;
            // loop for setting the last ele in correct position in the sorted subarray.

    }
}
