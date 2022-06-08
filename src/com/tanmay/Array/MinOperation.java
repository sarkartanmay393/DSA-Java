package com.tanmay.Array;

// https://www.geeksforgeeks.org/find-minimum-number-of-merge-operations-to-make-an-array-palindrome/
public class MinOperation {
    public static void main(String[] args) {
        int arr[] = new int[]{11, 14, 15, 19};
        System.out.println("Count of minimum operations is " +
                findMinOps(arr, arr.length));
    }

    static int findMinOps(int[] arr, int length) {
        return helper(arr, 0, length - 1);
    }

    static int helper(int[] arr, int i, int j) {
        if (i == j) {
            return 0;
        } // base case

        if (arr[i] == arr[j]) {
            return helper(arr, i + 1, j - 1);
        }

        if (j > 0 && arr[i] < arr[j]) {
            arr[j - 1] = arr[j] + arr[j - 1];
            return 1 + helper(arr, i, j - 1);
        }

        if (i < j && arr[i] > arr[j]) {
            arr[i] = arr[i] + arr[i + 1];
            return 1 + helper(arr, i + 1, j);
        }

        return 0;
    }
}
