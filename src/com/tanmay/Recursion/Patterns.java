package com.tanmay.Recursion;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,3,5,7,9,2,4,6,8};
        patterns1(n);
    }

    static void patterns1(int n) {
        
        helper1(n, 0);
    }
    static void helper1(int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            System.out.print('*');
            helper1(r, c+1);
        } else {
            System.out.println();
            helper1(r - 1, 0);
        }

    }

    static void patterns2(int n) {

        helper2(n, 0);
    }
    static void helper2(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            helper2(r, c+1);
            System.out.print('*');
        } else {
            helper2(r - 1, 0);
            System.out.println();
        }

    }

}
