package Leetcode75;

import java.util.Arrays;

// 605
// https://leetcode.com/problems/can-place-flowers/submissions/1104230197/?envType=study-plan-v2&envId=leetcode-75

public class CanPlaceFlowers {
  public static void main(String[] args) {
    int flowerbed[] = { 1, 0, 0, 0, 1, 0, 0 };
    int n = 2;

    String s = "sd";
    String t = "sd";

    char[] sd = s.toCharArray();

    System.out.println(canPlaceFlowers(flowerbed, n));
  }

  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    return helper(flowerbed, n);
  }

  static boolean helper(int[] fb, int cutoff) {
    for (int i = 0; i < fb.length; i++) {
      if (cutoff <= 0) {
        return true;
      }
      if (fb[i] == 0) {
        boolean leftEmpty = (i == 0) || (fb[i - 1] == 0);
        boolean rightEmpty = (i == fb.length - 1) || (fb[i + 1] == 0);

        if (leftEmpty && rightEmpty) {
          fb[i] = 1;
          cutoff--;
        }
      }
    }

    String s= "";
    s.toCharArray()

    return cutoff <= 0 && true;
  }
}
