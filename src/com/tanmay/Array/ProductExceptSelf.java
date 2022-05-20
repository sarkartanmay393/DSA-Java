package com.tanmay.Array;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf3(nums)));

    }

    public static int[] productExceptSelf3(int[] nums) {
        // Using Suffix Prefix Space-Optimised.
        // Time - O(N), Space - O(1).
        int n = nums.length;
        int[] res = new int[n];
        // Initiating res array from both end.
        res[0] = 1;

        // Calculating Prefix Values (First Loop).
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // Calculating Result by multiplying Suffix Values (Second Loop).
        for (int i = n - 1, SuffixProvider = 1; i >= 0; i--) {
            res[i] *= SuffixProvider;
            SuffixProvider *= nums[i];
        }

        return res;

    }

    public static int[] productExceptSelf2(int[] nums) {
        // Using Suffix Prefix.
        // Time - O(N), Space - O(N).
        int n = nums.length;
        int[] pre = new int[n], suf = new int[n], res = new int[n];

        pre[0] = 1;
        // Calculating Prefix.
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        suf[n - 1] = 1;
        // Calculating Suffix.
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] * nums[i + 1];
        }

        // Calculating Result.
        for (int i = 0; i < n; i++) {
            res[i] = pre[i] * suf[i];
        }

        return res;

    }

    public static int[] productExceptSelf1(int[] nums) {
        // Using Divisor Operator.
        // Time - O(N), Space - O(1).
        int n = nums.length;
        int[] res = new int[n];
        int WholeProduct = 1;
        for (int num : nums) {
            WholeProduct *= num;
        }
        for (int i = 0; i < n; i++) {
            res[i] = WholeProduct / nums[i];
        }

        return res;
    }
}