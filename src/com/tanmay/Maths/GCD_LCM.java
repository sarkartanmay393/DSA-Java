package com.tanmay.Maths;

public class GCD_LCM {
    public static void main(String[] args) {

        System.out.println(gcd(2,6));

    }

    // Using euclidean algorithm
    // Greatest common divisor/ Highest common factor
    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    // Least Common Multiple
    static int lcm(int a, int b){
        int hcf = gcd(a,b);

        //return (a/hcf * b/hcf * hcf);
        return (a*b)/hcf;

    }
}
