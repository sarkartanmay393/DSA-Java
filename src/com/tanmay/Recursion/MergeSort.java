package com.tanmay.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,2,4,6,8,0};

        mergesort_InPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergesort_InPlace(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = start + (end-start)/2;
        mergesort_InPlace(arr, start, mid);
        mergesort_InPlace(arr, mid, end);

        merge_InPlace(arr, start, mid, end);

    }
    static void merge_InPlace(int[] arr, int s, int m, int e){

        int[] res = new int[e - s];
        int i=s,j=m,k=0; //pointers

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                res[k] = arr[i++];
            } else {
                res[k] = arr[j++];
            }
            k++;
        }

        //adding rest of the ele from each arr if available
        while(i < m){
            res[k++] = arr[i++];
        }
        while(j < e){
            res[k++] = arr[j++];
        }

        i = 0;
        for (int ele : res) {
            arr[s+(i++)] = ele;
        }
    }

    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] first = mergesort(Arrays.copyOfRange(arr, 0 , mid));
        int[] second = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(first, second);
    }
    static int[] merge(int[] first, int[] second){
        int[] res = new int[first.length + second.length];
        int i=0,j=0,k=0; //pointers

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                res[k] = first[i];
                i++;
            } else {
                res[k] = second[j];
                j++;
            }
            k++;
        }

        //adding rest of the ele from each arr if available
        while(i < first.length){
            res[k] = first[i];
            i++; k++;
        }
        while(j < second.length){
            res[k] = second[j];
            j++; k++;
        }
        return res;

    }
}
