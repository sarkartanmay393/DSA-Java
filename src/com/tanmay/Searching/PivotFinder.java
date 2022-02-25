package com.tanmay.Searching;

public class PivotFinder {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2};
        System.out.println(PivotIdxFinder(arr));
    }


    static int PivotIdxFinder(int[] arr){
        int start = 0; int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            // 4 checks are applied to find pivot.
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int PivotIdxFinderDuplicates(int[] arr){
        int start = 0; int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(start < end && arr[start] > arr[start+1]){
                    return start;
                }                                                   //{2,4,9,2,2,2}
                start++;
                if(end > start && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
