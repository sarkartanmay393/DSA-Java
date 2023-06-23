package com.tanmay.Maths;

import java.util.ArrayList;

// Factors of N
public class Factor {
    public static void main(String[] args) {
        factorOptimisedV2(12);
    }

    // Time Complexity : O(n/2)
    static void factor(int n) {
        for (int i = 1; i <= n/2; i++) {
            if((n%i)==0){
                System.out.println(i);
            }
        }
        System.out.println(n);
    }

    // Time Complexity : O(sqrt(n))
    static void factorOptimised(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.println(i + " ");
                } else{
                    System.out.println(i + " " + n/i);
                }
            }
        }
    }

    // Time Complexity & Space Complexity : O(sqrt(n))
    // Sorted answer output
    static void factorOptimisedV2(int n){
        ArrayList<Integer> sHalf = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                } else{
                    System.out.print(i + " ");
                    sHalf.add(n/i);
                }
            }
        }
        for (int i = sHalf.size() - 1; i >= 0; i--) {
            System.out.print(sHalf.get(i) + " ");
        }
    }

}
