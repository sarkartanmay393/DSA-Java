package Leetcode75;

// 1071
// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75

public class GCDofString {
  public static void main(String[] args) {
    System.out.println(gcdOfStrings("ABCABCABC", "ABC"));
    
  }

  public static String gcdOfStrings(String str1, String str2) {
    if (!(str1 + str2).equals(str2 + str1)) {
      return "";
    }

    int gcdLength = gcd(str1.length(), str2.length());
    return str1.substring(0, gcdLength);
  }

  public static int gcd(int a, int b) {
    if (a == 0) {
      return b;
    }

    return gcd(b % a, a);
  }
}
