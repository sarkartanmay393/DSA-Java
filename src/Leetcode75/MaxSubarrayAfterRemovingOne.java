package Leetcode75;

// 1493
// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=study-plan-v2&envId=leetcode-75

public class MaxSubarrayAfterRemovingOne {
  public static void main(String[] args) {

  }

  public static int longestSubarray(int[] nums) {
    int s = 0, e = 0, r = 0;
    while (e < nums.length) {
      if (nums[e] == 0) {
        r++;
      }
      e++;

      if (r > 1) {
        if (nums[s] == 0) {
          r--;
        }
        s++;
      }
    }

    return e - s - 1;
  }
}
