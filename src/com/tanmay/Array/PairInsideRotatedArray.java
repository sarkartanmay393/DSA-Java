package com.tanmay.Array;

public class PairInsideRotatedArray {
    public static void main(String[] args) {
        int[] nums = {11, 15, 6, 8, 9, 10};
        System.out.println(pairInSortedRotated(nums, nums.length, 16));
    }

    static boolean pairInSortedRotated(int[] nums, int n, int target) {
        int pivot = PivotFinder(nums);

        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            int lSide = BS(nums, 0, pivot, diff);
            if(lSide >= 0) {
                return true;
            }
            int rSide = BS(nums, pivot+1, n-1, diff);
            if(rSide >= 0) {
                return true;
            }
        }

        return false;
    }

    static int BS(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
    static int PivotFinder(int[] nums) {
        int s = 0, e = nums.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (m > s && nums[m - 1] > nums[m]) {
                return m - 1;
            }
            if (m < e && nums[m] > nums[m + 1]) {
                return m;
            }
            if (nums[m] <= nums[s]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        return -1;
    }
}
