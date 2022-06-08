package com.tanmay.Array;

import java.util.HashMap;

public class LongestDivisibleSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        System.out.println(longSubarrWthSumDivByK(arr, 6, 3));
    }

    static int longSubarrWthSumDivByK(int a[], int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap();
        int max_len = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a[i];
            int mod = ((curr_sum % k) + k) % k; // moduling twice to eliminate negative value.
            if (mod == 0) {
                max_len = i + 1;
            }
            if (!hm.containsKey(mod)) {
                hm.put(mod, i);
            } else {
                max_len = Math.max(i - hm.get(mod), max_len);
            }
        }


        return max_len;
    }
}
