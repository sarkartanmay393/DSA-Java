package com.tanmay.Recursion.Maze;

// Maze Problem.
public class CountPaths {
    public static void main(String[] args) {
        int[] pos = { 5,5};
        System.out.println(countPossiblePaths(5,5));
    }

    static int countPossiblePaths(int r, int c) {
        if(r == 1 || c == 1){
            return 1;
        }
        int res = countPossiblePaths(r-1, c) + countPossiblePaths(r, c-1);
        return res;
    }
}
