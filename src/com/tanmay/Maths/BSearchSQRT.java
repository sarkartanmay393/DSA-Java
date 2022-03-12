package com.tanmay.Maths;

public class BSearchSQRT {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sqrt(n, 15));

    }

    // Time Complexity : O(log(N))
    static double sqrt(int n, int p) {
        int start = 0, end = n;
        double root = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                root = mid;
                return root;
            } else if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }


        return root;
    }




}