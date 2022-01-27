package com.tanmay.Patterns;
//1-15

public class Patterns1 {
    public static void main(String[] args) {

        Pattern12(5);

    }

    static void Pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void Pattern2(int n){
        for (int row = 1; row <= n; row++) {
            //rows count = outter for loop
            for (int col = 1; col <= row; col++) {
                //identify for every colomns
                //coloumns count = inner for loop
                //types of ele in colomns
                System.out.print("* ");
                //to print
            }
            System.out.println();
            //adding line after every inner loop
        }
    }

    static void Pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void Pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n){
        for (int row = 1; row < 2*n; row++) {//r4
            for (int col = 1; col <= (row>n?(2*n - row):row); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print("  ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void Pattern8(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col < 2*row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern9(int n){
        for (int row = 1, counter = 0; row <= n; row++, counter += 2) {
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col < 2*n - counter; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void Pattern10(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern11(int n){
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern12(int n){
        for (int row = 1; row <= 2*n; row++) {
            int upto1 = row>n?2*n-row:row-1;
            for (int spaces = 0; spaces < upto1; spaces++) {
                System.out.print(" ");
            }
            int upto = row>n?Math.abs(row-n):n-row+1;
            for (int col = 1; col <= upto; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern13(int n){
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces <= n-row-2; spaces++) {
                if(row!=n-1){
                    System.out.print(" ");
                }
            }
            for (int stars = 0; stars < 1; stars++) {
                System.out.print("*");
            }
            if(row != 0){
                for (int spacesWithStars = 0; spacesWithStars < 2*row; spacesWithStars++) {
                    if(row != n-1){
                        if (spacesWithStars != 2 * row - 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    } else{
                        System.out.print("*");
                    }
                }
            }

            System.out.println();
        }
    }

    static void Pattern14(int n){
        int counter = 1;
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < 1; stars++) {
                System.out.print("*");
            }

            if(row != n-1){
                for (int spacesWithStars = 0; spacesWithStars < 2 * n - 1 - counter; spacesWithStars++) {
                    if (row == 0) {
                        System.out.print("*");
                    } else {
                        if (spacesWithStars != 2 * n - 1 - counter - 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }

                }
            }

            counter+=2;
            System.out.println();
        }
    }

    static void Pattern15(int n){
        int counter = 0;
        for (int row = 1; row < 2*n ; row++) {
            for (int spaces1 = 0; spaces1 < Math.abs(n-row); spaces1++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < 1; stars++) {
                System.out.print("*");
            }
            if(row != 1 && row != 2*n-1){
                for (int spacesWithStars = 0; spacesWithStars < counter; spacesWithStars++) {
                    if(spacesWithStars != counter - 1){
                        System.out.print(" ");
                    } else{
                        System.out.print("*");
                    }
                }
            }
            if(row>=n){
                counter -= 2;
            }else {
                counter += 2;
            }
            System.out.println();
        }
    }


}
