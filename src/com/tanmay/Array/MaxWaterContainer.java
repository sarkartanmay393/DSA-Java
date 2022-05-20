package com.tanmay.Array;

import java.awt.*;

public class MaxWaterContainer {
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] height) {
        // Two Pointers Approach.
        // Space - O(1), Time - O(N).
        int n = height.length;

        int leftIndex = 0, rightIndex = n - 1, res = 0;
        while (leftIndex < rightIndex) {
            res = Math.max(res, (Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex)));
            if(height[leftIndex] <= height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }

        }
        return res;
    }

    public static int maxAreaBruteforce(int[] height) {
        // Space - O(1), Time - O(N^2).
        int n = height.length;
        int local_min = 0;
        int global_max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                local_min = Math.min(height[i], height[j]);
                if (local_min * (j - i) > global_max) {
                    global_max = local_min * (j - i);
                }
            }
        }

        return global_max;
    }
}