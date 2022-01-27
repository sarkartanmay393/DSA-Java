package com.tanmay.Recursion;
import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6 ,7, 8,9,10};
        SumTriangle(arr);
    }
    static void SumTriangle(int[] arr){
        if(arr.length < 1){
            return;
        } // base condition
        int[] DynamicArray = new int[arr.length-1];
        for (int i = 0; i < DynamicArray.length; i++) {
            DynamicArray[i] = arr[i]+arr[i+1];
        }
        SumTriangle(DynamicArray);
        System.out.println(Arrays.toString(arr));
    }
}
