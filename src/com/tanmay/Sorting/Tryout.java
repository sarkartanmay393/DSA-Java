package com.tanmay.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Tryout {
    public static void main(String[] args) {
        int[] nums = {1,1};


    }


    List<Integer> findDisappearedNumbers(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        while(i < arr.length){
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }
            else{
                i++;
            }
        }

        for (i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
