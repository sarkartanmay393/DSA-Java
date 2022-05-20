package com.tanmay.Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int[] nums = {7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallestQ(nums, 0, nums.length - 1, 3));
    }

    public static int kthSmallestQ(int[] arr, int l, int r, int k) {
        // it works.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }
        while(k > 1) {
            minHeap.poll();
            k--;
        }
        return minHeap.peek();
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {

        // base condition.
        // if K is in between the length of arr.
        if (k > 0 && k <= r - l + 1) {

            int n = r - l + 1;
            int[] medians = new int[(n + 4) / 5];
            int i;
            for (i = 0; i < n / 5; i++) {
                medians[i] = FindMedian(arr, l + i * 5, l + i * 5 + n % 5);
            } // it will store medians to the median array.
            // for the last group with less than 5 elements in it.
            if (i * 5 < n) {
                medians[i] = FindMedian(arr, l + i * 5, l + i * 5 + n % 5);
                i++;
            }
            // all median storing processes are done now.
            // now find median of the medians array.
            int medianOfMedians = (i==1) ? medians[i-1] : kthSmallest(arr, 0, i-1, i/2);
            // OR FindMedian(arr, 0, (n + 4) / 5);
            // Partition the array around a random element, and find the position of pivot in the sorted array.
            int pos = partition(arr, l, r, medianOfMedians);
            // now use count (= pos-l+1) to determine the kthSmallest.
            int count = pos - l + 1;
            if (count == k) {
                return arr[pos];
            }
            if (count > k) {
                return kthSmallest(arr, l, pos - 1, k);
            }
            return kthSmallest(arr, pos + 1, r, k - pos + l - 1);

        }

        return Integer.MAX_VALUE;
    }
    static int partition(int[] arr, int l, int r, int x) {

        /* search for x in the array and move it to the end. Maybe this part has less use to perform really. */

//        int i;
//        for (i = l; i < r; i++) {
//            if(arr[i] == x) {
//                break;
//            }
//        }
//        swap(arr, i, r);



        // Standard Partitioning Algorithm.
        int i = l;
        for (int j = l; j < r - 1; j++) {
            if (arr[j] <= x) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, r);
        return i;

    }
    static int FindMedian(int[] arr, int l, int r) {
        Arrays.sort(arr, l, r);
        return arr[l + (r - l) / 2];
    }
    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
