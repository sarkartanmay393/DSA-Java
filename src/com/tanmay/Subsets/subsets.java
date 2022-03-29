package com.tanmay.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3};
        System.out.println(subsetsWithDuplicates(arr).toString());


    }

    //  Subsets of Numbers Array using Iteration.
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for(int num : arr){
            int n = res.size();
            // Inner Lists counter to create 2x Inner lists. Exp : [[], [1]] -> [[],[1],[take],[take]] -> [[],[1],[took],[took],[take],[take],[take],[take]]
            // We use Previous inner lists to reject , and new lists do accept.
            for (int i = 0; i < n; i++) {
                List<Integer> innerList = new ArrayList<>(res.get(i)); // res.get(i) to put previous date.
                innerList.add(num);
                res.add(innerList);
            }
        }

        return res;
    }

    //  Subsets of Numbers Array with duplicate values using Iteration.
    public static List<List<Integer>> subsetsWithDuplicates(int[] arr) {
        Arrays.sort(arr); // Sort to put duplicates together.

        List<List<Integer>> res = new ArrayList<>(); // Will contain subsets.
        res.add(new ArrayList<>());

        int s = 0, e = 0; // Pointer to make it easy.

        for(int i=0; i<arr.length; i++){
            s = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                s = e + 1;
            }
            int n = res.size();
            e = res.size() - 1;
            for (int j = s; j < n; j++) {
                List<Integer> subset = new ArrayList<>(res.get(j));
                subset.add(arr[i]);
                res.add(subset);
           }
        }

        return res;
    }
}