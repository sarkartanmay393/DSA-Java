package com.tanmay.Recursion;

//Char array reverser

public class CharArrayReverser {
    public static void main(String[] args) {
        char[] s = {'o','l','l','e','h'};
        reverse(s,0, s.length-1);
        System.out.println(s);
    }

    static void reverse(char[] s, int start, int end){
        if(start >= end){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverse(s, start+1, end-1);
    }
}
