package com.tanmay.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,6,3};
        hybridSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    // Mergesort + Intertion sort
    // Intertion sort works well with partially sorted array.
    static void hybridSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int s = low, e = high;
        int m = s + (e-s) / 2;
        int pivot = arr[m];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int tmp = arr[s];
                arr[s] = arr[e];
                arr[e] = tmp;
                s++; e--;
            }
        }

        //sort call for rest
        hybridSort(arr, low, e);
        hybridSort(arr, s, high);
    }
}
