package com.tanmay.Array;

public class MaxSubarrayProduct {
    public static void main(String[] args) {
        int[] nums = {2, -5, -2, -4, 3};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        // Using Kadane's Algorithm.
        int n = nums.length;
        int local_product = 1;
        int global_product = Integer.MIN_VALUE;

        // RUN FROM LEFT TO RIGHT.
        for (int i = 0; i < n; i++) {
            local_product *= nums[i];
            if (local_product > global_product)
                global_product = local_product;
            if (local_product == 0)
                local_product = 1;
        }

        // RUN FROM RIGHT TO LEFT.
        local_product = 1;
        for (int i = n-1; i >= 0 ; i--) {
            local_product *= nums[i];
            if(local_product > global_product)
                global_product = local_product;
            if(local_product == 0)
                local_product = 1;
        }

        return global_product;
    }

    public static int maxProductDP(int[] nums) {
        // Using Dynamic Programming.
        // we have to keep track of curMax and curMin to deal with all negative values
        int res = nums[0];
        int curMax = 1, curMin = 1;

        // traverse the array
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                curMax = 1;
                curMin = 1;
            }

            // store curMax in temp for future reference
            int temp = curMax * nums[i];

            // maintain current max by comparing as below
            curMax = Math.max(curMax * nums[i], curMin * nums[i]);
            curMax = Math.max(curMax, nums[i]);

            // maintain current min by comparing as below
            curMin = Math.min(temp, curMin * nums[i]);
            curMin = Math.min(curMin, nums[i]);
//
//            // after printing below you will understand how it is working for all negative values
//            // [-2,-3,-5,-1]
//            System.out.println(curMax + " | " + curMin);

            // update maximum product in result
            res = Math.max(res, curMax);
        }


        // return calculated result
        return res;
    }
}
