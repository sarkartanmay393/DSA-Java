package com.tanmay.Bitwises;


public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,3,6,4,1};
        //System.out.println(SingleDigitIn(arr));
        int[] arr1 = {2,3,4,1,-2,-3,6,-4,-1};
        //System.out.println(SingleDigitUniversal(arr1));
        int[] arr2 = {1,1,1,2,2,2,3,3,3,4};
        //System.out.println(FindUniqueIn3sss(arr2));
        int n = 6;
        //System.out.println(FindMagicNumber(n));


    }

    static int SingleDigitIn(int[] arr) {
        int sum = 0;
        for(int ele : arr){
            sum ^= ele;
        }
        return sum;
    }

    static int SingleDigitUniversal(int[] arr) {
        int sum = 0;
        for(int ele : arr){
            sum += ele;
        }
        return sum;
    }

    static int FindUniqueIn3sss(int[] arr){
        int[] bitCounter = new int[32];

        for (int ele : arr) {
            StringBuffer tmp = new StringBuffer();
            tmp.append(Integer.toBinaryString(ele));
            tmp.reverse();
            for(int i=0; i<tmp.length();i++){
                if((int)(tmp.charAt(i)) == 48){
                    bitCounter[i] += 0;
                } else{
                    bitCounter[i] += 1;
                }
            }
        }
        //bitCounter has been created !

        StringBuffer ansinbase2 = new StringBuffer();
        for (int ele : bitCounter) {
            ansinbase2.append(ele%3);
        }
        ansinbase2.reverse();
        String str = ansinbase2.toString();
        str = str.replaceAll("^0+(?!$)", "");
        return Integer.parseInt(str, 2);
    }

    static int FindMagicNumber(int n){
        /*
        StringBuilder binaryRepresentation = new StringBuilder();
        binaryRepresentation.append(Integer.toBinaryString(n));
        binaryRepresentation.reverse();
        int ans = 0;
        for (int i = 0; i < binaryRepresentation.length(); i++) {
            ans += ((int)(binaryRepresentation.charAt(i))==48?0:1) *(Math.pow(5,i+1));
        }
        return ans;
        */
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n >>= 1;
            ans += last * base;
            base *= 5;
        }
        return ans;
    }





}
