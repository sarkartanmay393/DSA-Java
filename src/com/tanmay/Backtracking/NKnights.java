package com.tanmay.Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solveKKnights(new boolean[n][n], 0, 0, n));
    }

    static int solveKKnights(boolean[][] board, int row, int col, int target) {
        if(target == 0) {
            display(board);
            System.out.println();
            return 1;
        }
        if(row == board.length - 1 && col == board.length) {
            return 0;
        } // when this gets executed, we can say, one combination is done.
        int count = 0;
        if(col == board.length) {
            count += solveKKnights(board, row+1, 0, target);
            return count;
        } // for changing row.
        if(isSafe(board, row, col)) { // pass into next col with knight.
            board[row][col] = true;
            count += solveKKnights(board, row, col+1, target-1);
            board[row][col] = false;
        } // for executing into deep, for completing a combination.
        count += solveKKnights(board, row, col+1, target);
        // pass into next col without knight.
        return count;
    }
    static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row-2, col-1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if(isValid(board, row-2, col+1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if(isValid(board, row-1, col-2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if(isValid(board, row-1, col+2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board, int row, int col) {
        if(row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }
    static void display(boolean[][] board) {
        for(boolean[] subarr : board) {
            for(boolean ele : subarr) {
                if(ele) {
                    System.out.print("K ");
                } else {
                    System.out.print("~ ");
                }
            }
            System.out.println();
        }
    }
}
