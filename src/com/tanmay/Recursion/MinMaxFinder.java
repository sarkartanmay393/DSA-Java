package com.tanmay.Recursion;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] arr = {1,2,45,45,45,-345,-234,22114};
        //System.out.println(MaxOf(arr,arr.length-1));
        //System.out.println(MinOf(arr, arr.length-1));

    }

    static int MinOf(int[] arr, int end) {
        if(end == 0){
            return arr[end];
        }
        return Math.min(arr[end], MinOf(arr, end -1));
    }

    static int MaxOf(int[] arr, int end) {
        if(end == 0){
            return arr[end];
        }   //base condition

        return Math.max(arr[end], MaxOf(arr, end-1));   //return statement
    }


}
