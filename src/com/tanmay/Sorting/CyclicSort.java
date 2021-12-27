package com.tanmay.Sorting;

import java.util.Arrays;

//Works in (1 to N) Ranged Array.
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIdx = nums[i] - 1;
            if(nums[i] != nums[correctIdx])
                swap(nums, i, correctIdx);
            else
                i++;
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
