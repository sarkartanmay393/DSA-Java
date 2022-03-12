package com.tanmay.Bitwises;

public class PowerOf2orNot {
    public static void main(String[] args) {
  /*      int n = 80;
        boolean isIt = false;
        while(n>1){
            if((n&1) != 0){
                isIt = false;
                break;
            }
            isIt = true;
            n >>= 1;
        }
*/
        //Optimised way
        int n = 4;
        if((n&(n-1)) == 0){
            System.out.println("True");
        } else{
            System.out.println("False");
        }



    }
}
