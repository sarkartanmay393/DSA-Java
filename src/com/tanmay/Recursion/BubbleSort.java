package com.tanmay.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        Bubble(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr, int n){
        if(n == 0)
            return;
        for (int i = 1; i <= n; i++) {
            if(arr[i] < arr[i-1]){
                int tmp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = tmp;
             }
        }

        Bubble(arr, n-1);

    }
}
