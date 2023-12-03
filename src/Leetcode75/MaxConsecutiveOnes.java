package Leetcode75;

// 1004
// https://leetcode.com/problems/max-consecutive-ones-iii/description/?envType=study-plan-v2&envId=leetcode-75

public class MaxConsecutiveOnes {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
    System.out.println(longestOnes(nums, 6));
  }

  public static int longestOnes(int[] nums, int k) {
    int start = 0, end = 0, zeros = 0;
    while (end < nums.length) {
      if (nums[end] == 0) {
        zeros++;
      }
      end++;
      if (zeros > k) {
        if (nums[start] == 0) {
          zeros--;
        }
        start++;
      }
    }

    return end - start;
  }
}
