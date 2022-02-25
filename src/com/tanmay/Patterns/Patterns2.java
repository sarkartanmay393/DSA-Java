package com.tanmay.Patterns;

public class Patterns2 {
    public static void main(String[] args) {
        Pattern31(4);
    }




    static void Pattern16(int n){
        for (int row = 1; row <= n; row++) {
            int counter = 0;
            for (int spacesWithStuff = 0; spacesWithStuff < 2*n; spacesWithStuff++) {

            }



            System.out.println();
        }
    } //not completed
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
    static void Pattern18(int n){
        int tmp = 0;
        for (int row = 0; row < 2*n; row++) {
            if (row + 1 != n + 1 && row != 0) {
                if(row+1>n){
                    tmp-=2;
                } else{
                    tmp+=2;
                }
            } else {
                int nothing;
            }
            for (int col = 1; col <= (row<n?n-row:row-n+1); col++) {
                System.out.print("*");
            }
            if(row != 0 && row != 2*n -1){
                for (int spaces = 1; spaces <= tmp; spaces++) {
                    System.out.print(" ");
                }
            }
            for (int colMirror = 1; colMirror <= (row<n?n-row:row-n+1); colMirror++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern19(int n){

        int something = 1, something1 = 2, something2 = 1;
        for (int row = 1; row <= 2*n; row++) {
            for (int col = 1; col <= (row>n?n-something:row); col++) {
                System.out.print("*");
            }
            if(row>n){
                something++;
            }
            for (int spaces = 1; spaces <= (row>n?something1:2*n-row*2); spaces++) {
                System.out.print(" ");
            }
            if(row>n){
                something1+=2;
            }
            for (int colMirror = 1; colMirror <= (row>n?n-something2:row); colMirror++) {
                System.out.print("*");
            }
            if(row>n){
                something2++;
            }
            System.out.println();
        }

    }
    static void Pattern20(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < 1; col++) {
                System.out.print("*");
            }
            if(row != 0 && row != n-1){
                for (int spaces = 0; spaces < (n-1)/2; spaces++) {
                    System.out.print(" ");
                }
            } else{
                for (int specialCase = 0; specialCase < (n-1)/2; specialCase++) {
                    System.out.print("*");
                }
            }
            for (int colMirror = 0; colMirror < 1; colMirror++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern21(int n){
        int increasingVar = 1;
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(increasingVar++ + " ");
            }
            System.out.println();
        }
    }
    static void Pattern22(int n){
        int increasingVar = 1;
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(increasingVar + " ");
                increasingVar = increasingVar == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }
    static void Pattern23(int n){
        
    }    //not completed
    static void Pattern24(int n){
        int i = 1, j = 2;
        for (int row = 1; row <= 2*n; row++) {
            int upto = (row>n?row-i:row);
            if(row>n) {i += 2;}
            for (int col = 1; col <= upto; col++) {
                if(col==upto || col==1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            int upto1 = row>n?j-2*n -2:2*n - j; j+=2;
            for (int spaces = 1; spaces <= upto1; spaces++) {
                System.out.print(" ");
            }

            //duplicated of above
            for (int col = 1; col <= upto; col++) {
                if(col==upto || col==1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    static void Pattern25(int n){
        int i = 0;
        for (int row = 0; row < n; row++) {

            for (int spaces = 1; spaces <= n - i ; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= n; col++) {
                if(row == 0 || row == n-1){
                    System.out.print("*");
                } else{
                    if(col == 1 || col == n){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            i++;
            System.out.println();
        }
    }
    static void Pattern26(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(row+1 + " ");
            }
            System.out.println();
        }
    }
    static void Pattern27(int n){
        int x = 1, i = 0, y = 0, j = 2;
        y = 4*n - n + 2;
        for (int row = 0; row < n-1; row++) {
            i++;
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print("  ");
            }
            for (int col = 0; col < n-i; col++) {
                System.out.print(x++ + " ");
            }
            if(row!=0){
                y-=(n-i);
            }
            int tmp = y;
            for (int colMirror = 0; colMirror < n-i; colMirror++) {
                if(row == n-2){
                    System.out.print(tmp++);
                } else {
                    System.out.print(" " + tmp++);
                }
            }
            System.out.println();
        }
    }
    static void Pattern28(int n){
        for (int row = 1; row < 2*n; row++) {
            int upto = row>n?row-n:n-row;
            for (int spaces = 1; spaces <= upto; spaces++) {
                System.out.print(" ");
            }
            int upto1 = row>n?n-upto:row;
            for (int col = 0; col < upto1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern29(int n){
        for (int row = 1; row < 2*n; row++) {

            int upto = row>n?n-(row-n):row;
            for (int col = 1; col <= upto; col++) {
                System.out.print("*");
            }

            int upto1 = row>n?2*(row%n):2*n - 2*row;
            for (int spaces = 1; spaces <= upto1; spaces++) {
                System.out.print(" ");
            }


            for (int col = 1; col <= upto; col++) {
                System.out.print("*");
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
    static void Pattern31(int n){
        int originalN = n;
        n = n * 2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEachIndex =  originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));

                System.out.print(atEachIndex + " ");
            }
            System.out.println();
        }
    } //flagged




}
