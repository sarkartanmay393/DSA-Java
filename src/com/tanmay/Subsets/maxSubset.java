package com.tanmay.Subsets;

import java.util.ArrayList;
import java.util.List;

public class maxSubset {

        public static void main(String[] args) {
            int[] arr = {5,4,-1,7,8};
            System.out.println(maxSubArray(arr));

        }

        public static int maxSubArray(int[] arr) {
            return maxList(subsetRec(arr));
        }
        public static int maxList(List<List<Integer>> subsets){

            int finalSum = Integer.MIN_VALUE;
            for (int i = 0; i < subsets.size(); i++) {


                int sum = 0;
                for (int j = 0; j < subsets.get(i).size(); j++) {
                    sum += subsets.get(i).get(j);
                }
                if(sum > finalSum){
                    finalSum = sum;
                }
                if(sum == 24){
                    System.out.println(i);
                }
                // for subarray
            }
            return finalSum;

        }
        static List<List<Integer>> subsetRec(int[] arr) {
        List<List<Integer>> res = new ArrayList<>(); // will contain all subsets.
        res.add(new ArrayList<>()); //  initialized first sub Arraylist of res as empty subset.

        for (int num : arr) {
            int n = res.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(res.get(i)); // helper list.
                internal.add(num);
                res.add(internal);
            }
        }
        return res;
    }

}

