package Leetcode75;

import java.util.Arrays;

// 1679
// https://leetcode.com/problems/max-number-of-k-sum-pairs/description/

class MaxKPairOperations {
  public static void main(String[] args) {
    int[] nums = { 4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4 };
    System.out.println(maxOperations(nums, 2));
  }

  public static int maxOperations(int[] nums, int k) {
    int sp = 0, n = nums.length, op = 0;
    int ep = n - 1;

    Arrays.sort(nums);
    while (sp < ep) {
      int sum = nums[sp] + nums[ep];
      if (sum == k) {
        sp++;
        ep--;
        op++;
      } else if (sum < k) {
        sp++;
      } else {
        ep--;
      }
    }

    return op;
  }
}