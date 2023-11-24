package Leetcode75;

// 151
// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75

public class ReverseString {
  public static void main(String[] args) {
    String s = "   the sky is   blue  ";
    System.out.println(reverseWordsU(s));
  }

  // using memory
  public static String reverseWordsU(String s) {
    s = s.trim();
    String[] words = s.split("\\s+");
    String res = "";

    for (int i = words.length - 1; i >= 0; i--) {
      res += words[i] + " ";
    }
    return res.stripTrailing();
  }
}
