package com.tanmay.Maths;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
            sieve(50);
    }

    //Prime numbers upto N, optimised.
    static void sieve (int n){
        boolean[] notPrimes = new boolean[n+1];

        for (int i = 2; i*i <= n; i++) {
            if(!notPrimes[i]){
                for (int j = i*2; j <= n; j+=i) {
                    notPrimes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!notPrimes[i]) {
                System.out.print(i + "\n");
            }
        }


    }
}
