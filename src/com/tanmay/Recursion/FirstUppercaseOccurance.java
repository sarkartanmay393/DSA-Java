package com.tanmay.Recursion;

public class FirstUppercaseOccurance {
    public static void main(String[] args) {
        String str = "acbdsjFafj";
        System.out.println(FUO(str, 0));
    }

    static String FUO(String str, int begining) {
        if(begining > str.length()-1){
            return "not found";
        }   //base condition
        if(Character.isUpperCase(str.charAt(begining))){
            return str.substring(begining,begining+1);
        }   //recursive call
        return FUO(str, begining+1); //return statement
    }
}
