package com.tanmay.Recursion;

import java.util.ArrayList;

class tryout {
    public static void main(String[] args) {
        String str = "3[a2[c]]";
    }
}

class Leetcode394 {
    public String decodeString(String s) {
        if(s.isEmpty()) {
            return "\0";
        }
        String res = "";

        int multiplier = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) - '0' > 1) {
                multiplier = s.charAt(i) - '0';
            }
        }



        return res;
    }
}
class Leetcode279 {
    public static int numSquares(int n) {
        int result=n, num= 2;
        while(num*num<=n){
            int temp1= n/(num*num), temp2= n%(num*num);
            result= Math.min(result,temp1+numSquares(temp2));
            num++;
        }
        return result;
    }
}
class Leetcode1922 {
    public static int countGoodNumbers(long n) {
        int start = 1;
        for (int i = 1; i < n; i++) {
            start *= 10;
        }
        int end = 9;
        for (int i = 1; i < n; i++) {
            end *= 10;
            end += 9;
        }
        ;
        return helper(n, Integer.toString(start), Integer.toString(end), start, start);
    }
    public static int helper(long n, String start, String end, int currNum, int diff) {
        int count = 0;
        if(start == end) {
            return 1;
        }

        // checks
        if(start.charAt(0) % 2 != 0) {
            start = Integer.toString(currNum+ diff);
        }
        for (int i = 1; i < n; i++) {
            boolean isEvenIdx = false;
            if(i%2==0)
                isEvenIdx = true;
            if(isEvenIdx && (start.charAt(i) - '0')%2==0) {
                String tmp = start;
                start = Integer.toString(tmp.charAt(0) - '0');
                for (int j = 1; j < tmp.length(); j++) {
                    if(j == tmp.length()-1) {
                        start += ((tmp.charAt(j) - '0') + 1);
                    }
                    else {
                        start += tmp.charAt(j);
                    }
                }
                count += 1 + helper(n, start, end, Integer.parseInt(start), diff);
            }
            if(!isEvenIdx && isPrime(String.valueOf(start.charAt(i)))) {
                String tmp = start;
                start = Integer.toString(tmp.charAt(0) - '0');
                for (int j = 1; j < tmp.length(); j++) {
                    if(j == tmp.length()-1) {
                        start += ((tmp.charAt(j) - '0') + 1);
                    }
                    else {
                        start += tmp.charAt(j);
                    }
                }
                count += 1 + helper(n, start, end, Integer.parseInt(start), diff);
            }
        }


        return count;
    }
    static boolean isPrime(String nStr){
        int n = nStr.charAt(0) - '0';
        int tr = 1;
        while(!(nStr.isEmpty())) {
            n *= 10;
            n += nStr.charAt(tr);
            tr+=1;
        }
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

}
class Leetcode779 {
    public static int kthGrammar(int n, int k) {
        ArrayList<String> List = new ArrayList<>();
        return helper(0, List, n, k);
    }
    private static int helper(int tracker, ArrayList<String> List, int n, int k) {
        if(tracker == n) {
            return List.get(n-1).charAt(k-1) - '0';
        }

        if(tracker == 0) {
            List.add("0");
        } else { // core logic of the problem.
            String tmp = "";
            for (int ch = 0; ch < List.get(tracker-1).length(); ch++) {
                if(List.get(tracker-1).charAt(ch) == '0') {
                    tmp += "01";
                } else {
                    tmp += "10";
                }
            }
            List.add(tmp);
        }


        return helper(tracker+1, List, n, k);


    }
}
class Leetcode1545 {
    public static char findKthBit(int n, int k) {

            return helper(n-1, "0", k);
        }
    private static char helper(int n, String binaryNum, int k) {

            if(n == 0) {
                return binaryNum.charAt(k-1);
            } // base condition.

            binaryNum = binaryNum + "1" + invertAndReverse(binaryNum);

            return helper(n-1, binaryNum, k);

        }
    // this func will run for max 20 times as n <= 20.
    public static StringBuilder invertAndReverse(String s){

            //inverting the bits of the given string using XOR with 1;
            char[] chars = new char[s.length()];

            for(int i=0;i<s.length();i++){
                chars[i] = (char)(s.charAt(i)^1);
            }
            String flipped = new String(chars);

            StringBuilder str = new StringBuilder(flipped);

            return str.reverse();
        }
    }