package com.tanmay.Problems.Leetcode;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }

    static int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
