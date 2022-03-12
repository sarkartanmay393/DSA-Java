package com.tanmay.Bitwises;

public class DigitsinUniqueBase {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(noOfDigits(n, 8));
    }
    static int noOfDigits(int n, int base){
        int ans = (int)(Math.log(n)/Math.log(base))+1;
        return ans;
    }
}