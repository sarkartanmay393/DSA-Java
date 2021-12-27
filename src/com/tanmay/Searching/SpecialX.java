package com.tanmay.Searching;

import java.util.Arrays;

public class SpecialX {
    public static void main(String[] args) {
        int[] nums = {3,5};
        Arrays.sort(nums);
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {

        int start = 0;
        int end = nums.length;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(count(nums, mid) == mid){
                return mid;
            }
            else if(count(nums, mid) > mid){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }

    // to count numbers in arr that are greater than or equal to target
    public static int count(int[] nums, int target){
        int sum = 0;
        for(int n : nums){
            if (n >= target){
                sum++;
            }
        }

        return sum;

    }
}
