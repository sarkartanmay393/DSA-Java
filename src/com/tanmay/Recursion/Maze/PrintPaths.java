package com.tanmay.Recursion.Maze;

import java.util.ArrayList;
import java.util.List;

// Maze Problem.
public class PrintPaths {
    public static void main(String[] args) {

        System.out.println(PossiblePathsV2("", 3,3));
    }

    static void printPossiblePaths(String p, int r, int c) {
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            printPossiblePaths(p + 'D', r-1, c);
        }
        if(c > 1){
            printPossiblePaths(p + 'R', r, c-1);
        }
    }

    // Possible Paths into ArrayList
    static List<String> PossiblePathsV1(String p, int r, int c) {
        if(r == 1 && c == 1){
            List<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }
        List<String> res = new ArrayList<>();
        if(r > 1){
            res.addAll(PossiblePathsV1(p + 'D', r-1, c));
        }
        if(c > 1){
            res.addAll(PossiblePathsV1(p + 'R', r, c-1));
        }
        return res;
    }

    // Possible Paths into ArrayList, including diagonals.
    static List<String> PossiblePathsV2(String p, int r, int c) {
        if(r == 1 && c == 1){
            List<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }
        List<String> res = new ArrayList<>();
        if(c > 1 && r > 1){
            res.addAll(PossiblePathsV2(p + 'D', r-1, c-1));
        }
        if(r > 1){
            res.addAll(PossiblePathsV2(p + 'H', r-1, c));
        }
        if(c > 1){
            res.addAll(PossiblePathsV2(p + 'V', r, c-1));
        }

        return res;
    }



}
