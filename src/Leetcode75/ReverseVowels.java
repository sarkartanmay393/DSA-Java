package Leetcode75;

// 345
// https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75

public class ReverseVowels {
  public static void main(String[] args) {
    String s = "leetcode";
    System.out.println(reverseVowels(s));
  }

  public static String reverseVowels(String s) {
    char[] chars = s.toCharArray();
    int start = 0;
    int end = s.length() - 1;
    String vowels = "AEIOUaeiou";

    while (start < end) {
      while (start < end && vowels.indexOf(chars[start]) == -1) {
        start++;
      }
      while (start < end && vowels.indexOf(chars[end]) == -1) {
        end--;
      }

      char tmp = chars[start];
      chars[start] = chars[end];
      chars[end] = tmp;

      start++;
      end--;
    }
    
    String resp = new String(chars);
    return resp;
  }
}
