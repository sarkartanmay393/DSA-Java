package com.tanmay.String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String s = "abcdba";
        String[] strs = {"c","acc","ccc"};



        StringBuilder LongestPrefix = new StringBuilder();
        LongestPrefix.append(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            if(!strs[i].startsWith(LongestPrefix.toString())){
                // It's not the longest prefix then.
                //LongestPrefix.delete(0, LongestPrefix.length());
                int range = 0;
                for (int j = 0; j < strs[i].length(); j++) {
                    if(LongestPrefix.charAt(j) == strs[i].charAt(j)){
                        range++;
                        continue;
                    } else{
                        break;
                    }
                }
                LongestPrefix.delete(range, LongestPrefix.length());
            }
        }


        System.out.println(LongestPrefix);

    }
}