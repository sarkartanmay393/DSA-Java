package com.tanmay.Recursion;

public class Tryout {
    public static void main(String[] args) {
        System.out.println(FiboEfficient(50));

    }

    static int ProductOf(int a, int b){
        if(a<b){
            int tmp = b; b = a; a = tmp;
        }
        if(b == 0){
            return 0;
        }
        b--;
        return ProductOf(a, b) + a;
    }
    static boolean isPrime(int n, int iterator){
        if(n <= 2){
            return n==2?true:false;
        }
        if(n%iterator == 0) {
            return false;
        }
        if(iterator*iterator > n){
            return true;
        }
        return isPrime(n, iterator+1);
    }
    static int FiboEfficient(int n){
        return (int)((Math.pow((1+Math.sqrt(5))/2, n))/ Math.sqrt(5));
    }

}
