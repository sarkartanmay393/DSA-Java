package com.tanmay.Array;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int local_max = 0;
        int global_max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            local_max = Math.max(nums[i], nums[i]+local_max);
            if(global_max < local_max) {
                global_max = local_max;
            }
        }

        return global_max;
    }
}
