package com.tanmay.Recursion;

public class ArrRecursion {

    public static void main(String[] args) {
        int[] arr = {0,1,10,9,7,4,6,3,2};
        System.out.println(linearSearch(arr, 10));

    }

    static boolean isSorted(int[] arr) {
        return helper1(arr, 0);
    }
    static boolean helper1(int[] arr, int pointer){
        if(pointer == arr.length - 1){
            return true;
        }
        return arr[pointer] <= arr[pointer + 1] && helper1(arr, pointer+1);

    }

    static int linearSearch(int[] arr, int target){

        return helper2(arr, target, 0);
    }
    static int helper2(int[] arr, int target, int index){
        if(index == arr.length){
            return '\0';
        }

        if(arr[index] == target){
            return index;
        }

        return helper2(arr, target, index+1);

    }



}
