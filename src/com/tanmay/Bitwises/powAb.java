package com.tanmay.Bitwises;

public class powAb {
    public static void main(String[] args) {
        System.out.println(powerOf(5,-3));
    }

    // n = power, x = base number.
    static double powerOf(double x, int n) {
        if(n == 0) {
            return 1.0;
        }
        if(n == 1) {
            return x;
        }
        if(n < 0) {
            return powerOf(1/x, -n);
        }
        double ans = powerOf(x*x, n/2);
        if((n&1)==1) { // if n is odd then it will execute.
            ans *= x;
        }

        return ans;
    }
}
