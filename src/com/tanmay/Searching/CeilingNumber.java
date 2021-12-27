package com.tanmay.learn;

public class CeilingNumber {
    //Smallest number greater than equal to target
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        System.out.println(Ceiling(arr, 15));

    }

    static int Ceiling(int[] arr, int target){
        int start = 0; int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start]; //for Floor (greatest number smaller than equal to target) - return arr[end];

    }
}
