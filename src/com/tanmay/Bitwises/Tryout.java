package com.tanmay.Bitwises;


import java.util.*;
import java.lang.*;
import java.io.*;

class Tryout {
    public static void main(String[] args) throws java.lang.Exception {
        //System.out.println(Leetcode1545.findKthBit(20, 1048575));
        int[] arr = {1,1,2};
        System.out.println(Curated_ARR1.removeDuplicates(arr));
    }

}

class Curated_ARR1 {
    public static int removeDuplicates(int[] nums) {
        int preV = 0;
        for (int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                nums[i] = -101;
            }
            preV = (nums[i] != -101 ? nums[i] : preV);
        } // unchecked duplicates.


        int k = 0;
        for (int num : nums) {
            if(num != -101) {
                k++;
            }
        }

        int[] res = new int[k];
        for (int i=0,j=0; i<k; i++) {
            if(nums[i] != -101) {
                res[j] = nums[i];
                j++;
            }
        }

        nums = res;
        return k;

    }
}




