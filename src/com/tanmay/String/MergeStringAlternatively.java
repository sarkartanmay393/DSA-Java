package com.tanmay.String;

public class MergeStringAlternatively {
    public static void main(String[] args) {

        String word1 = "abcd"; String word2 = "pq";

        StringBuilder res = new StringBuilder();
        for(int i=0,j=0,k=0,helper=1; i<(word1.length() < word2.length() ? word1.length()*2 : word2.length()*2);
            i++){
            if(helper != 0){
                res.append(word1.charAt(j));
                j++;
                helper--;
            } else{
                res.append(word2.charAt(k));
                k++;
                helper++;
            }
        }

        int biggerLen = Math.max(word1.length(), word2.length());
        int smallerLen = Math.min(word1.length(), word2.length());

        res.append((word1.length()>word2.length()?word1:word2).substring(smallerLen, biggerLen));

        System.out.println(res);

    }
}
