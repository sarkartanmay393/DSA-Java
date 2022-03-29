package com.tanmay.Recursion.Maze;

import java.util.ArrayList;
import java.util.List;

public class WithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        System.out.println(possiblePathsV4("", maze, 0, 0));
    }

    // Includes obstacle.
    static List<String> possiblePathsV3(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1){
            List<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
//        if(r < maze.length - 1 && c < maze[0].length - 1){
//             res.addAll(possiblePathsV3(p + 'V', maze, r+1, c+1));
//        } // includes diogonal lines.
        if(r < maze.length - 1){
            res.addAll(possiblePathsV3(p + 'D', maze, r+1, c));
        }
        if(c < maze[0].length - 1){
            res.addAll(possiblePathsV3(p + 'H', maze, r, c+1));
        }

        return res;
    }

    // Includes all direction possibility.
    // Stack overflow, cause of infinite numbers of calls is getting made.
    // We have to fix it with Backtracking.
    static List<String> possiblePathsV4(String p, boolean[][] maze, int r, int c)   {
        if(r == maze.length - 1 && c == maze[0].length - 1){
            List<String> inner = new ArrayList<>();
            inner.add(p);
            return inner;
        }

        // for obstacles.
        if(!maze[r][c]){
            return new ArrayList<>();
        }

        // Backtracking fix.
        maze[r][c] = false;

        List<String> res = new ArrayList<>();
//        if(r < maze.length - 1 && c < maze[0].length - 1){
//             res.addAll(possiblePathsV3(p + "VU", maze, r+1, c+1));
//        } // includes diogonal lines.
//        if(r > 0 && c > 0){
//            res.addAll(possiblePathsV3(p + "VD", maze, r-1, c-1));
//        }
        if(r < maze.length - 1){
            res.addAll(possiblePathsV4(p + 'R', maze, r+1, c));
        }
        if(c < maze[0].length - 1){
            res.addAll(possiblePathsV4(p + 'U', maze, r, c+1));
        }
        if(r > 0){
            res.addAll(possiblePathsV4(p + 'L', maze, r-1, c));
        }
        if(c > 0){
            res.addAll(possiblePathsV4(p + 'D', maze, r, c-1));
        }

        // this line is where the function will be over.
        // so before the function gets removed, remove all the changes that were made by that function.
        // Backtracking fix.
        maze[r][c] = true;

        return res;
    }

}
