package com.tanmay.Patterns;
//16-
public class Patterns2 {
    public static void main(String[] args) {
        Pattern17(5);
    }

//    static void Pattern16(int n){
//        for (int row = 1; row <= n; row++) {
//            int counter = 0;
//            for (int spacesWithStuff = 0; spacesWithStuff < 2*n; spacesWithStuff++) {
//                if()
//            }
//
//
//
//            System.out.println();
//        }
//    }


    static void Pattern17(int n){
        for (int row = 1; row <= 2*n-3 ; row++) {
            int upto = row>n-1?row-n+1:n-row-1;
            for (int spaces = 0; spaces < upto; spaces++) {
                System.out.print(" ");
            }
            for (int col = row>n-1?-(row-n)+(n-2):row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= (row<n-1?row:-(row-n)+(n-2)); col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void Pattern30(int n){
        for (int row = 1; row <= n ; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void Pattern18(int n){
        for (int row = 1; row <= 2*n; row++) {

        }
    }




}
