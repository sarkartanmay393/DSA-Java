package com.tanmay.Maths;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,3,6,4,1};
        //System.out.println(SingleDigitIn(arr));
        int[] arr1 = {2,3,4,1,-2,-3,6,-4,-1};
        //System.out.println(SingleDigitUniversal(arr1));
        int[] arr2 = {1,1,1,2,2,2,3,3,3,4};
        System.out.println(FindUniqueIn3sss(arr2));

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

}
