package com.tanmay.Searching;

//Sorted Infinite Array
public class InfiniteArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(Ans(arr, 5));
    }

    static int Ans(int[] arr, int target){
        int start = 0; int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1)*2; //Doubling a size of the search range.
            start = temp;
        }
        return BS(arr, target, start, end);
    }

    static int BS(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
