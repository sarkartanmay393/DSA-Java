package com.tanmay.String;

public class StringSorting {
    public static void main(String[] args) {

        String s = "is2 sentence4 This1 a3";
        String[] tmp = s.split(" ");
        String[] res = new String[tmp.length];


        for (int i = 0; i < tmp.length; i++) {
            int index = tmp[i].charAt(tmp[i].length() - 1) - '0';
            res[index - 1] = tmp[i].substring(0, tmp[i].length() - 1);
        }
            System.out.println(String.join(" ", res));

    }
}