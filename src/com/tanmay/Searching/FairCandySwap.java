package com.tanmay.Searching;

import java.util.Arrays;
import java.util.HashSet;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = new int[] {1,2,5};
        int[] bobSizes = new int[] {2,4};

        System.out.println(Arrays.toString(fairSwap(aliceSizes, bobSizes)));

    }

    static int[] fairSwap(int[] aliceSizes, int[] bobSizes) {
        int Sa = 0, Sb = 0;
        for (int x:aliceSizes) {
            Sa += x;
        }
        for (int y:bobSizes) {
            Sb += y;
        }
        int Delta = (Sb - Sa)/2;

        HashSet<Integer> SetB = new HashSet<>();
        for(Integer x:bobSizes){
            SetB.add(x);
        }

        for (int x:aliceSizes){
            if(SetB.contains(x+Delta)){
                return new int[]{x,x+Delta};
            }
        }

        throw  null;

    }
}
