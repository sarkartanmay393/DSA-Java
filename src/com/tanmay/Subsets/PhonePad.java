package com.tanmay.Subsets;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        String digits = "12";
        System.out.println(letterCombinations(digits).toString());
    }
    // PhonePad
    // Letter combinations of Phone Numbers.
    // Returns void.
    static void combinations(String p, String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = str.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) { // Range = [(digit-1)*3, digits*3)
            char ch = (char) ('a' + i);
            combinations(p+ch, str.substring(1));
        }

    }

    // Returns in ArrayList
    static List<String> phonepadList(String p, String str){
        if(str.isEmpty()){
            List<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        List<String> finalres = new ArrayList<>();
        int digit = str.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            finalres.addAll(phonepadList(p+ch, str.substring(1)));
        }

        return finalres;
    }

    // Returns count of process.
    static int phonepadCounter(String p, String str){
        if(str.isEmpty()){
            return 1;
        }
        int digit = str.charAt(0) - '0';
        int count = 0;
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            count = count + phonepadCounter(p+ch, str.substring(1));
        }

        return count;
    }

    // Leetcode Problem (N -> 2 to 9)
    public static List<String> letterCombinations(String digits) {
        if(digits == null){
            return new ArrayList<>();
        }
        return phonepadhelper("", digits);
    }
    public static List<String> phonepadhelper(String p, String digits){
        if(digits.isEmpty()){
            List<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }

        List<String> out = new ArrayList<>();
        int digit = digits.charAt(0) - '0';
        String str = pattern(digit);
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            out.addAll(phonepadhelper(p + ch, digits.substring(1)));
        }

        return out;
    }
    public static String pattern(int n){
        switch(n){
            default :
                return "";
            case 2 :
                return "abc";
            case 3 :
                return "def";
            case 4 :
                return "ghi";
            case 5 :
                return "jkl";
            case 6 :
                return "mno";
            case 7 :
                return "pqrs";
            case 8:
                return "tuv";
            case 9 :
                return "wxyz";
        }
    }


}
