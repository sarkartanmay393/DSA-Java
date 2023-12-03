package Leetcode75;

// 11
// https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75

public class ContainerMostWater {
  public static void main(String[] args) {
    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(maxArea(height));
  }

  public static int maxArea(int[] height) {
    int max = 0;
    int n = height.length;
    int sp = 0;
    int ep = n - 1;

    while (sp < ep) {
      int min = Math.min(height[sp], height[ep]);
      int water = min * (ep - sp);
      if (water > max) {
        max = water;
      }
      if (min == height[sp]) {
        sp++;
      } else {
        ep--;
      }
    }

    return max;

  }
}
