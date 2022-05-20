package com.tanmay.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++; end--;
        }
    }
}
