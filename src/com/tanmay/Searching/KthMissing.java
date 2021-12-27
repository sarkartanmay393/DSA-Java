package com.tanmay.Searching;

//https://leetcode.com/problems/kth-missing-positive-number/
public class KthMissing {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11}; int k = 5;
        int ans = findKthPositive(arr, k); //9
        System.out.println(ans);
    }

    static int findKthPositive(int[] arr, int k) {
        int M_counter = 0; int arr_tracker = 0; // int main_tracker = 0;
        int start = 1; int end = arr[arr.length-1];

        //Missing counting
        while(start <= end){
            if(arr_tracker > arr.length-1){
                break;
            }
            if(arr[arr_tracker] == start){
                start++;
                arr_tracker++;
            }else{
                M_counter++;
                if(M_counter == k){
                    return start;
                }
                start++;

            }
        }

        return end+(k-M_counter);
    }
}
