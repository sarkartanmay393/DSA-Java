package com.tanmay.Backtracking;

public class SudokoSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1, col = -1;

        // check for unsolved box.
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i; col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) {
                break;
            } // if we find an unsolved box, break and do work for it.
        }

        if (emptyLeft) {
            return true;
        } // kind of base condition.

        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if(!solve(board)) {
                    board[row][col] = 0; // for backtrack.
                } else {
                    return true;
                }
            }
        }

        return false;
    }
    static boolean isSafe(int[][] board, int row, int col, int number) {
        // check for row.
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == number) {
                return false;
            }
        }
        // check for col.
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }
        //check for 3*3 area.
        int sqrt = (int)(Math.sqrt(board.length));
        int rowS = row - row % sqrt;
        int colS = col - col % sqrt;
        for (int rowIndex = rowS; rowIndex < rowS + sqrt; rowIndex++) {
            for (int colIndex = colS; colIndex < colS + sqrt; colIndex++) {
                if (board[rowIndex][colIndex] == number) {
                    return false;
                }
            }
        }

        return true;
    }

}
