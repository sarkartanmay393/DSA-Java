package com.tanmay.Array;

public class RotatedArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2}; // Rotated Array.
        System.out.println(search(nums, 1));
    }

    static int search(int[] nums, int target) {
        int Pindex = PivotIndexFinder(nums);
        int leftSearch = BS(nums, target, 0, Pindex);
        if (leftSearch >= 0) {
            return leftSearch;
        } else {
            return BS(nums, target, Pindex, nums.length);
        }
    }

    static int BS(int[] nums, int target, int s, int e) {
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

    static int PivotIndexFinder(int[] nums) {
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m < e && nums[m] > nums[m + 1]) {
                return m;
            }
            if (m > s && nums[m] < nums[m - 1]) {
                return m - 1;
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
