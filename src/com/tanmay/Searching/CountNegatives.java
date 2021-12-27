package com.tanmay.Searching;

public class CountNegatives {
    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3} // If first ele is negative then rest of the column is negative.
        };
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {

        int row = grid.length - 1;
        int col = 0;
        int count = 0;
        int N = grid[0].length;

        while(row >= 0){
            //runs for each row
            while(col < N && grid[row][col] >= 0){
                col++;
            }
            count += (N-col);
            row--;
        }
        return count;
    }

}
