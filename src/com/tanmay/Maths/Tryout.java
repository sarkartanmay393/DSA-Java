package com.tanmay.Maths;
import java.util.Arrays;

public class Tryout {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        Arrays.sort(nums);

        int ans = 1;

        for(int i=nums.length - 3; i<nums.length;i++){
            ans *=  nums[i];
        }

        System.out.println(ans);
    }
}
