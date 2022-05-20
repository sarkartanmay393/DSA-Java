package com.tanmay.Array;


import java.util.Arrays;

public class ChocoDistribution {
    public static void main(String[] args) {
        int N = 7, M = 3;
        int[] A = {7, 3, 2, 4, 9, 12, 56};
        System.out.println(findMinDiff(A, N, M));

    }

    public static long findMinDiff (int[] nums, long n, long m) {
        Arrays.sort(nums);

        int local_diff = 0;
        int global_diff = Integer.MAX_VALUE;

        for (int i = 0; i <= n-m; i++) {
            local_diff = Math.abs(nums[i] - nums[(int) (i+m-1)]);
            if(local_diff < global_diff) {
                global_diff = local_diff;
            }
        }

        return global_diff;
    }
}
