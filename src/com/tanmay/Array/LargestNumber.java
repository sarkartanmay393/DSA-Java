package com.tanmay.Array;

import java.util.*;

class comparator implements Comparator<String> {

    @Override
    public int compare(String X, String Y) {
        String XY = X + Y;
        String YX = Y + X;
        return XY.compareTo(YX) > 0 ? -1 : 1;
    }
} // it's way.


public class LargestNumber {
    public static void main(String[] args) {
        String[] arr = {"250", "74", "659", "931", "273", "545", "879", "924"};
        System.out.println(printLargest(arr));
    }

    static String printLargest(String[] arr) {
        Vector<String> arrV = new Vector<>();
        arrV.addAll(List.of(arr));
        Collections.sort(arrV, (a, b) -> {
            String ab = a+b;
            String ba = b+a;
            return (ab).compareTo(ba) > 0 ? -1 : 1;
        });


        String res = "";
        for(int i=0; i<arrV.size(); i++) {
            res += arrV.elementAt(i);
        }
        return res;
    }

    static void sort(String[] arr) {
        // O(N^2)
        // sorted by lexicographically.
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length; j++) {
                if (Integer.parseInt(arr[j - 1] + arr[j]) < Integer.parseInt(arr[j] + arr[j - 1])) {
                    String tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
                swapped = true;
            }
            if (!swapped) {
                return;
            }
        }

    }


}

