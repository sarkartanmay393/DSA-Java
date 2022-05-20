package com.tanmay.Array;

public class MinMax {

    public static void main(String[] args) {
        long[] nums = {0, 9, 1, 2, 3, 45, 6, -9};
        pair output = getMinMax(nums);
        output.print();
    }

    static pair getMinMax(long a[]) {
        pair res = new pair(a[0], a[0]);

        for (long num : a) {
            if (num < res.first) {
                res.first = num;
            }
            if (num > res.second) {
                res.second = num;
            }
        }

        return res;
    }
}

class pair {
    long first;
    long second;

    pair(long f, long s) {
        this.first = f;
        this.second = s;
    }

    void print() {
        System.out.print("Lowest Element : " + first);
        System.out.println(", ");
        System.out.print("Highest Element : " + second);
    }
}
