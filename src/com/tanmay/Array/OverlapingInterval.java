package com.tanmay.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class OverlapingInterval {
    public static void main(String[] args) {

        int[][] intervals = {{6, 8}, {1, 9}, {2, 4}, {4, 7}};
        int[][] rs = merge(intervals);
        for (int[] num : rs) {
            System.out.println(Arrays.toString(num));
        }
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals) {
           if(merged.isEmpty() || merged.getLast()[1] < interval[0]) {
               merged.add(interval);
           } else {
               merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
           }

        }

        return merged.toArray(new int[merged.size()][]);
    }


}
