package com.tanmay.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,6,5,4};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr) {

        bubbleHelper(arr, arr.length -1, 0);
    }
    static void bubbleHelper(int[] arr, int e, int s){
        if(e == 0){
            return;
        }
        if(s < e){
            if(arr[s] > arr[s+1]){
                swap(arr, s, s+1);
            }
            bubbleHelper(arr, e, s+1);
        } else{
            bubbleHelper(arr, e-1, 0);
        }
    }
    static void swap(int[] arr, int firstIdx, int secondIdx){
        arr[firstIdx] ^= arr[secondIdx];
        arr[secondIdx] ^= arr[firstIdx];
        arr[firstIdx] ^= arr[secondIdx];
    }



}
