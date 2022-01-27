package com.tanmay.Recursion;

public class Tryout {
    public static void main(String[] args) {

        System.out.println(Fib(93,25, 86));

    }
    static int Fib(int a, int b, int n){
        if(n==1){
            return b;
        }else if(n==0){
            return a;
        } else if(n==2){
            return a^b;
        }
        return Fib(a ,b, n%3);
    }

}
