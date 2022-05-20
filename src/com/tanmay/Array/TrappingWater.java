package com.tanmay.Array;

public class TrappingWater {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        // Dynamic Programming.
        int n = height.length;
        int[] maxL = new int[n]; // for storing maxes from left.
        int[] maxR = new int[n]; // for storing maxes from right.

        maxL[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxL[i] = Math.max(height[i], maxL[i - 1]);
        }
        maxR[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxR[i] = Math.max(height[i], maxR[i + 1]);
        }

        int[] WaterHoldingCapacity = new int[n];
        for (int i = 0; i < n; i++) {
            WaterHoldingCapacity[i] = Math.min(maxL[i], maxR[i]) - height[i];
        }

        int res = 0;
        for (int num : WaterHoldingCapacity) {
            res += num;
        }
        return res;
    }


    public static int trapTwoPointer(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, res = 0;

        while (left < right) {
            if (height[left] > leftMax)
                leftMax = height[left];
            if (height[right] > rightMax)
                rightMax = height[right];

            if (height[left] > height[right]) {
                res += leftMax - height[left];
                left++;
            } else {
                res += rightMax - height[right];
                right--;
            }
        }

        return res;
    }

    public static int trapBruteforce(int[] height) {
        int res = 0, n = height.length;

        int leftMax, rightMax, j;
        leftMax = rightMax = 0;

        for (int i = 0; i < n; i++) {
            j = i;
            // to beginning.
            while (j >= 0) {
                leftMax = Math.max(height[j], leftMax);
                j--;
            }
            j = i;
            // to ending.
            while (j < n) {
                rightMax = Math.max(height[j], rightMax);
                j++;
            }
            // calculation.
            res += (Math.min(leftMax, rightMax) - height[i]);
        }

        return res;
    }
}
