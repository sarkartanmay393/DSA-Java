package com.tanmay.Bitwises;

public class setBitCounter {
    public static void main(String[] args) {
        int n = 9, counter = 0;
        while(n>0){
            if((n&1)==1){
                counter++;
            }
            n >>= 1;
        }
        System.out.println(counter);
        //Integer.bitCounter()
    }
}
