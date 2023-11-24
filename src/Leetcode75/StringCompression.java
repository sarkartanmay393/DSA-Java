package Leetcode75;

import java.util.Arrays;

// 443
// https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75

public class StringCompression {
  public static void main(String[] args) {
    char[] chars = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
    System.out.println(compress(chars));
  }

  public static int compress(char[] chars) {
    int len = chars.length;
    if (len == 0)
      return 0;
    if (len == 1)
      return 1;

    String s = "", gs = "";
    int n = chars.length;
    for (int i = 0; i < n; i++) {
      char c = chars[i];
      int gl = gs.length();
      if (gl > 0) {
        char gc = gs.charAt(0);
        if (c == gc) {
          gs += c;
        } else {
          if (gl > 1) {
            s += gc + String.valueOf(gl);
          } else {
            s += gc;
          }
          gs = "" + c;
        }
      } else {
        gs += c;
      }

      if (i == n - 1) {
        if (gs.length() > 1) {
          s += gs.charAt(0) + String.valueOf(gs.length());
        } else {
          s += gs.charAt(0);
        }
      }
    }

    Arrays.fill(chars, ' ');
    for (int i = 0; i < s.length(); i++) {
      chars[i] = s.charAt(i);
    }

    System.out.println(s);
    return s.length();
  }
}
