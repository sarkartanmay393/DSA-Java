package com.tanmay.Backtracking;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = combinationSum2(candidates, target);

        for(List<Integer> list : res){
            System.out.println(list);
        }

    }

    // Leetcode 39
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> l = new ArrayList<>();
//        helper(l, new ArrayList<>(), candidates, target, 0, 0);
//        return l;
//    }
//    private void helper(List<List<Integer>> res, List<Integer> InnerSet, int[] candidates, int target, int index, int sum){
//
//        // base cases
//        if(sum > target) return;
//        if(index >= candidates.length) {
//            if(target == sum)res.add(new ArrayList<>(InnerSet));
//            return;
//        }
//
//        // if considering to take.
//        InnerSet.add(candidates[index]);
//        helper(res, InnerSet, candidates, target, sum + candidates[index], index);
//
//        InnerSet.remove(InnerSet.size() - 1);
//        // if considering not to take.
//        helper(res, InnerSet, candidates, target, sum, index + 1 );
//
//    }

    // Leetcode 40
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<>();
        helper(l, new ArrayList<>(), candidates, target, 0, 0);
        return l;
    }
    private static void helper(List<List<Integer>> res, List<Integer> InnerSet, int[] candidates, int target, int index, int sum){

        // base cases
        if(sum > target) return;
        if(index >= candidates.length) {
            if(target == sum)res.add(new ArrayList<>(InnerSet));
            return;
        }


        // if considering to take.
        InnerSet.add(candidates[index]);
        helper(res, InnerSet, candidates, target, sum + candidates[index], index+1);

        InnerSet.remove(InnerSet.size() - 1);
        // if considering not to take.
        helper(res, InnerSet, candidates, target, sum, index + 1 );

    }

}
