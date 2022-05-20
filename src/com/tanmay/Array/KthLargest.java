package com.tanmay.Array;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(kthLargest(nums, 4));
    }

    public static int kthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
