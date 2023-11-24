package Leetcode75;

// 334
// https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

class TripleSequence {
  public static void main(String[] args) {
    int[] nums = { 2, 1, 5, 0, 4, 6 };
    System.out.println(increasingTriplet(nums));

  }

  // look for smallest two numbers and find bigger than them
  public static boolean increasingTriplet(int[] nums) {
    int a, b = Integer.MAX_VALUE;
    a = b;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] <= a) {
        a = nums[i];
      } else if (nums[i] <= b) {
        b = nums[i];
      } else if (nums[i] > a && nums[i] > b) {
        return true;
      }
    }

    return false;
  }
}
