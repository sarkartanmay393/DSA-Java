package Leetcode75;

// 1732
// https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75

public class FindHighestAltitude {
  public static void main(String[] args) {

  }

  public static int largestAltitude(int[] gain) {
    int h = 0, pref = 0;
    ;
    for (int i = 0; i < gain.length; i++) {
      pref += gain[i];
      h = Math.max(pref, h);
    }
    return h;
  }

}