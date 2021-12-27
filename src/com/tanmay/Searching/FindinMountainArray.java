package com.tanmay.learn;

public class FindinMountainArray {
    public static void main(String[] args) {
        int arr[] = {1,5,10,15,20,25,22,18,14,9,4,2}; //Mountain Array
        int index = searcher(arr, 5);
        System.out.println(index);

    }
    static int searcher(int[] arr, int target){
        int ans = -1;
        int start = 0; int end = peakIndexInMountainArray(arr);
        int temp_ans = OrderAgnosticBS(arr, target, start, end);
        if(temp_ans != -1){
            return temp_ans;
        } else{
            ans = OrderAgnosticBS(arr, target, end+1, arr.length-1);
        }
        return ans;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0; int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int OrderAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            } else{
                if(target < arr[mid]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
