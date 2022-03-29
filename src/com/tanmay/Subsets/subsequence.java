package com.tanmay.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequence {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subsetsOfaString(str, "").toString());
    }

    //  Subsets of a string using Recursion.
    static ArrayList<String> subsetsOfaString(String str, String res){
        if(str.isEmpty()){
            ArrayList<String> out = new ArrayList<>();
            out.add(res);
            return out;
        }
        ArrayList<String> firstHalf = subsetsOfaString(str.substring(1), res+str.charAt(0));
        ArrayList<String> secondHalf = subsetsOfaString(str.substring(1), res);
        firstHalf.addAll(secondHalf);
        return firstHalf;
    }
    

}
