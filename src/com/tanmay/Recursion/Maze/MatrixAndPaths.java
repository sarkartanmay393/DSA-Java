package com.tanmay.Recursion.Maze;

import java.util.Arrays;

public class MatrixAndPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        int[][] emptyArr = new int[3][3];
        possiblePathsV5("", maze, 0, 0, emptyArr, 1);
    }

    static void possiblePathsV5(String p, boolean[][] maze, int r, int c, int[][] arr, int step)   {
        if(r == maze.length - 1 && c == maze[0].length - 1){
            arr[r][c] = step;
            for (int[] subArr : arr) {
                System.out.println(Arrays.toString(subArr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        // for obstacles.
        if(!maze[r][c]){
            return;
        }

        // Backtracking fix.
        maze[r][c] = false;
        arr[r][c] = step;

        if(r < maze.length - 1){
            possiblePathsV5(p + 'D', maze, r+1, c, arr, step+1);
        }
        if(c < maze[0].length - 1){
            possiblePathsV5(p + 'R', maze, r, c+1, arr, step+1);
        }
        if(r > 0){
            possiblePathsV5(p + 'U', maze, r-1, c, arr, step+1);
        }
        if(c > 0){
            possiblePathsV5(p + 'L', maze, r, c-1, arr, step+1);
        }

        // this line is where the function will be over.
        // so before the function gets removed, remove all the changes that were made by that function.
        // Backtracking fix.
        maze[r][c] = true;
        arr[r][c] = 0;
    }

}
