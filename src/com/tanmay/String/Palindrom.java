package com.tanmay.String;

import java.util.*;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usrInput;

        usrInput = sc.nextLine();

        System.out.println(palindromornot(usrInput));
    }

    static boolean palindromornot(String str){
        int i=str.length()-1, j=0;
        while(j<str.length()/2){
            if(str.charAt(j++) == str.charAt(i--)){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }
}
