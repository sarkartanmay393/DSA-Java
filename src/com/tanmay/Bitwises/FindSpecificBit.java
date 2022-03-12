package com.tanmay.Bitwises;

public class FindSpecificBit {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(ithBit(n,4));
    }

    static int ithBit(int n, int i) {
        return ((n&(1<<i-1)) == 0 ? false : true) == true ? 1 : 0;
    }
}
