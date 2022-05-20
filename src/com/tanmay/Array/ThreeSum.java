package com.tanmay.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums).toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int p1Index = 0; p1Index < nums.length - 2; p1Index++) {

            if (p1Index > 0 && nums[p1Index] == nums[p1Index - 1]) {
                continue;
            } // Skip duplicates from starting edge.

            int p2Index = p1Index + 1;
            int p3Index = nums.length - 1;

            while (p2Index < p3Index) {

                int sum = nums[p1Index] + nums[p2Index] + nums[p3Index];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[p1Index], nums[p2Index], nums[p3Index]));
                    p3Index--;
                    while (p2Index < p3Index && nums[p3Index] == nums[p3Index + 1]) {
                        p3Index--;
                    }
                }
                if (sum > 0) {
                    p3Index--;
                } else {
                    p2Index++;
                }

            }

        }
        return result;
    }


}
