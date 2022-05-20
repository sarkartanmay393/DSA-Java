package com.tanmay.Array;

import java.util.Arrays;

public class RepeatedandMissing {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 3};
        System.out.println(Arrays.toString(repeatedNumber(nums)));
    }

    public static int[] repeatedNumber(final int[] nums) {
        int[] res = new int[2];

        long Sum, ActSum, SqSum, ActSqSum;
        Sum = ActSum = SqSum = ActSqSum = 0;
        int n = nums.length;

        // calculating Sum, SqSum.
        for (int i = 1; i <= n; i++) {
            Sum += i;
            SqSum += i * i;
        }
        // calculating ActSum, ActSqSum.
        for (int i = 0; i < n; i++) {
            ActSum += nums[i];
            ActSqSum += nums[i] * nums[i];
        }

        long x = Sum - ActSum;
        long y = (SqSum - ActSqSum)/x;
        long a = (x+y)/2;
        long b = a-x;

        res[0] = (int) b;
        res[1] = (int) a;
        return res;
    }

}
