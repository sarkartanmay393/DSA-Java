package com.tanmay.learn;

public class BinarySearchOA {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {6, 5, 4, 3, 2, 1};
        System.out.println(OrderAgnosticBS(arr1,6));

    }

    // code
    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0; int end = arr.length - 1;
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
