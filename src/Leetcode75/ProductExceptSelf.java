package Leetcode75;

import java.util.Arrays;

// 238
// https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75

public class ProductExceptSelf {
  public static void main(String[] args) {
    System.out.println(productExceptSelf(new int[] { 1, 2, 3, 4 }));

  }

  // Time: O(N), Space: O(1)
  public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    Arrays.fill(ans, 1);

    int dynamicVal = 1;
    for (int i = 0; i < n; i++) {
      ans[i] *= dynamicVal;
      dynamicVal *= nums[i];
    }

    dynamicVal = 1;
    for (int i = n - 1; i >= 0; i--) {
      ans[i] *= dynamicVal;
      dynamicVal *= nums[i];
    }

    return ans;
  }

  // Time: O(N), Space: O(N)
  public static int[] productExceptSelfU(int[] nums) {
    int n = nums.length;
    int[] pre = new int[n];
    int[] suf = new int[n];
    pre[0] = 1;
    suf[n - 1] = 1;

    for (int i = 1; i < n; i++) {
      pre[i] = pre[i - 1] * nums[i - 1];
    }

    for (int i = n - 2; i >= 0; i--) {
      suf[i] = suf[i + 1] * nums[i + 1];
    }

    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      ans[i] = pre[i] * suf[i];
    }

    return ans;
  }
}
