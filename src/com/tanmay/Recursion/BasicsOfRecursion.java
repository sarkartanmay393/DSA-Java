package com.tanmay.Recursion;

public class BasicsOfRecursion {
    public static void main(String[] args) {

        int n = 30201;

        String str = "elefle";
        System.out.println(countZeros(n));

    }

    static int countZeros(int n) {

        if(n%10 == n){
            return ((n%10 == 0)?1:0);
        }

        return ((n%10 == 0)?1:0) + countZeros(n/10);

    }

    static boolean isPalindrom(String str, int start, int end) {

        if(str.charAt(start) == str.charAt(end)){
            start++;
            end--;
        } else{
            return false;
        }

        if(start > end){
            return true;
        }

        return isPalindrom(str, start, end);

    }

    static boolean isPalindromINT(int n) {

        return n == reverseNo2(n);

    }

    static char firstUC(String str, int i) {

        if(str.charAt(i) == '\0'){
            return 0;
        }

        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }

        try {
            return firstUC(str, ++i);
        }
        catch (Exception e){
            System.out.println("NO UPPER CASES!");
        }

        return 0;

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

    static void printupto(int n){
        if(n==0){
            return;
        }
        printupto(n-1);
        System.out.println(n);
    }

    static int  factorial(int n){
        if(n < 2) {
            return n;
        }

        return factorial(n-1)*n;
    }

    static int sumOfdigits(int n){
        if(n<1){
            return 0;
        }

        return (n%10)+sumOfdigits(n/10);
    }

    static int reverseNo1(int n, int revN){
        if(n%10 == n){
            revN = (revN + (n%10));
            return revN;
        }

        revN = (revN + (n%10))*10;

        return reverseNo1(n/10, revN);
    }

    static int reverseNo2(int n){

        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);

    }
    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }

        int remainder = n%10;
        return (remainder * (int)(Math.pow(10, digits-1))) + helper(n/10, digits - 1);
    }




}
