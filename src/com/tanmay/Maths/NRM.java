package com.tanmay.Maths;

public class NRM {
    public static void main(String[] args) {
        System.out.println(sqrt(64));
        //System.out.println(Math.sqrt(16));
    }

    // Newton Raphson Method of Square Root
    static double sqrt(double n) {
        double x = n;
/*      x --> assumed root, at first we start with the number
        itself as assumed root.   */
        double root;
        while(true){
            root = 0.5*(x+(n/x));
            if(Math.abs(root-x) < 0.5){
            // 0.0000000001, using lower base value, we can
            // get to more accurate answer.
            // Error = (root-x) ;
            // Our motive is to get the lowest error possible.
                break;
            }
            x = root;
        }
        return root;
    }
}
