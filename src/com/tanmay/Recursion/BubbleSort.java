package com.tanmay.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8,0};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr) {

        bubbleHelper(arr, arr.length -1, 0);
    }
    static void bubbleHelper(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                swap(arr, c, c+1);
            }
            bubbleHelper(arr, r, c+1);
        } else{
            bubbleHelper(arr, r-1, 0);
        }
    }
    static void swap(int[] arr, int firstIdx, int secondIdx){
        arr[firstIdx] ^= arr[secondIdx];
        arr[secondIdx] ^= arr[firstIdx];
        arr[firstIdx] ^= arr[secondIdx];
    }



}
