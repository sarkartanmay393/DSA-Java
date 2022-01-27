package com.tanmay.Recursion;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};

        System.out.println(BS(arr, 9, 0, arr.length -1));
    }

    static int BS(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        } // base condition

        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return BS(arr, target, start, mid - 1);
        }
        return BS(arr, target, mid+1,end);
    }

}
