package com.tanmay.Recursion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6,-5,-4,-3,-2,-1};
        Intertion(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void Intertion(int[] arr, int n) {
        if(n <= 1)
            return;
            //base

        Intertion(arr, n-1); //recursive call

        int lastEle = arr[n-1];
        int i = n-2;

        while(i >= 0 && arr[i] > lastEle){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = lastEle;
            //loop for setting the last ele in correct position in the sorted subarray


    }
}
