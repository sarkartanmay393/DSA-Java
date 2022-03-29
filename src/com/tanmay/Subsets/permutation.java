package com.tanmay.Subsets;

import java.util.ArrayList;

public class permutation  {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(permutationsCounter("", str));

    }

    // Permutation in List
    public static ArrayList<String> permutations(String proccessed, String unproccessed){
        if(unproccessed.isEmpty()){
            ArrayList<String> res = new ArrayList<>();
            res.add(proccessed);
            return res;
        }

        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i <= proccessed.length(); i++) {
            String s = proccessed.substring(0, i);
            String e = proccessed.substring(i, proccessed.length());
            res.addAll(permutations(s+unproccessed.charAt(0)+e,
                    unproccessed.substring(1)));
        }
        return res;
    }

    // Permutation Counter
    public static int permutationsCounter(String proccessed, String unproccessed){
        if(unproccessed.isEmpty()){
            return 1;
        }

        int counter = 0;
        char ch = unproccessed.charAt(0);

        for (int i = 0; i <= proccessed.length(); i++) {
            String s = proccessed.substring(0, i);
            String e = proccessed.substring(i, proccessed.length());
            counter = counter + permutationsCounter(s+ch+e,
                    unproccessed.substring(1));
        } // important loop.

        return counter;
    }
}
