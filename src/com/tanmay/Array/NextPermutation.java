package com.tanmay.Array;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Finding non-increasing element from behind.
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        // Finding next larger element from non-increasing element.
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i+1);
    }

    static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] nums, int f, int s) {
        int tmp = nums[f];
        nums[f] = nums[s];
        nums[s] = tmp;
    }
}
