package com.tanmay.Searching;

import java.util.*;


public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};

        System.out.println(Arrays.toString(intersection(arr1,arr2)));

    }

    //Works even for duplicates 🤩
    static int[] intersection(int[] nums1, int[] nums2) {
        int idx = 0;
        HashSet<Integer> set1 = new HashSet<>();
        for(int i : nums1) {
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums2) {
            set2.add(i);
        }

        set1.retainAll(set2);

        int[] ans = new int[set1.size()];
        for( int i : set1){
            ans[idx++] = i;
        }
        return ans;
    }
}
