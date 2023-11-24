package Leetcode75;

import java.util.ArrayList;

// 1431
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.List;

public class KidsWithCandies {
  public static void main(String[] args) {
    int[] candies = { 2, 3, 5, 1, 3 };
    int extraCandies = 3;
    System.out.println(kidsWithCandies(candies, extraCandies));
  }

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int highest = 0;
    List<Boolean> resp = new ArrayList<Boolean>();

    for (int i = 0; i < candies.length; i++) {
      if (highest < candies[i]) {
        highest = candies[i];
      }
    }

    for (int i = 0; i < candies.length; i++) {
      if (candies[i] + extraCandies >= highest) {
        resp.add(true);
      } else {
        resp.add(false);
      }
    }

    return resp;
  }
}
