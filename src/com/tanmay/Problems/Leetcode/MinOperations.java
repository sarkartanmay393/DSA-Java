package com.tanmay.Problems.Leetcode;

public class MinOperations {
    public static void main(String[] args) {
        System.out.println(minOperations(6));
    }

    static int minOperations(int n) {
        int ops = 0;

        for (int i = 0; i < n / 2; i++) {
            int x = (2 * i) + 1;
            ops += (n - x);
        }

        return ops;
    }

}
