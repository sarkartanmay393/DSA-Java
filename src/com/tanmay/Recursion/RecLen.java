package com.tanmay.Recursion;

public class RecLen {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(recLen(str));
    }

    static int recLen(String str){
        if(str.equals("")){
            return 0;
        }
        return 1 + recLen(str.substring(1));
    }
}
