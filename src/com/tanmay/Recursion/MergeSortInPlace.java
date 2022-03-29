package com.tanmay.Recursion;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {1,7, 9 ,0};
        mergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr, int s, int e){
        if(e-s == 1){
            return;
        }
        int m = s + (e-s)/2;
        mergesort(arr, s, m);
        mergesort(arr, m, e);
        merge(arr, s, m, e);
    }
    static void merge(int[] arr, int s, int m, int e){
        int[] res = new int[e-s];
        int i=s, j=m, k=0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                res[k] = arr[i++];
            } else{
                res[k] = arr[j++];
            }
            k++;
        }

        while(i < m) {
            res[k++] = arr[i++];
        }
        while(j < e) {
            res[k++] = arr[j++];
        }
        for(int l=0; l<res.length; l++){
            arr[s+l] = res[l];
        }
    }


}
