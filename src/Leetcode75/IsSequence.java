package Leetcode75;

// 392 
// https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75

public class IsSequence {
  public static void main(String[] args) {
    String s = "abc";
    String t = "ahbgdc";

    System.out.println(isSubsequence(s, t));
  }

  public static boolean isSubsequence(String s, String t) {
    int sl = s.length();
    int tl = t.length();
    int sp = 0, tp = 0;

    while (sp < sl && tp < tl) {
      if (s.charAt(sp) == t.charAt(tp)) {
        sp++;
        tp++;
      } else {
        tp++;
      }
    }

    return sp == sl;
  }
}
