package com.tanmay.Backtracking;



// Leetcode 51
public class NQueens {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(solveNQueens(new boolean[n][n], 0));

    }

    static int solveNQueens(boolean[][] board, int row) {
        if(row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true; // for backtracking.
                count += solveNQueens(board, row + 1); // it will perform N-1 amount of task.
                board[row][col] = false;
            }
        }

        return count;
    }
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check for vertical row.
        for (int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }
        // check for diagonal left.
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        // check for diagonal right.
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }
        return true;
    }
    private static void display(boolean[][] board) {
        for(boolean[] subArr : board) {
            for (boolean ele : subArr) {
                if(ele) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}