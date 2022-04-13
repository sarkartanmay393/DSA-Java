package com.tanmay.Recursion;

public class CatalanNums {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Catalan(6/2));
    }

    private static int Catalan(int n) {
        int res = 0;
        if(n<=1) {
            return 1;
        } // base condition.

        for (int i = 0; i < n; i++) {
            res += Catalan(i)*Catalan(n-i-1);
        }
        return res;
    }

    // # If handshakes
}
