package com.tanmay.Subsets;

import java.util.List;
import java.util.ArrayList;

public class DiceRolls {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(numRollsToTarget(30, 30, 500));
    }

    // Compute the combinations to sum up target.
    static void diceRoll(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target ; i++) {
            diceRoll(p+i, target - i);
        }
    }

    // Compute the combinations to sum up target, return in arraylist.
    static List<String> diceRollList(String p, int target){
        if(target == 0){
            List<String> res = new ArrayList<>();
            res.add(p);
            return res;

        }
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            result.addAll(diceRollList(p+i, target - i));
        }
        return result;
    }

    // Compute the combinations to sum up target with custom dice face, return in arraylist.
    static List<String> diceRollCustomList(String p, int target, int face){
        if(target == 0){
            List<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= face && i <= target ; i++) {
            result.addAll(diceRollList(p+i, target - i));
        }
        return result;
    }

    // Leetcode 1155
    public static int numRollsToTarget(int n, int k, int target) {
        return helper("", target, k, n);
    }
    public static int helper(String p, int target, int k, int n){
        if(n == 0 || target < 1) return 0;
        if(n == 1 && target >= 1 && target <= k) return 1;

        int count = 0;
        for(int i=1; i<=k && i<=target; i++){ // variations loop
            count = (count + helper(p+i, target-i, k, n-1))%1000_000_007;
        }

        return count;

    }

}
