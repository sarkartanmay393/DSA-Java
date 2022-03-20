package com.tanmay.Recursion;

import java.util.ArrayList;

public class Array_Recursion {

    public static void main(String[] args) {
        int[] arr = {5,6,7,0,1,2,3,4};
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);res.add(2);res.add(3);

        System.out.println(8&7);

    }

    static int RotatedBS(int[] arr, int target){
        return helper3(arr, target, 0, arr.length-1);
    }
    static int helper3(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return helper3(arr, target, start, mid - 1);
            } else {
                return helper3(arr, target, mid + 1, end);
            }
        }
        if(target >= arr[mid] && target <= arr[end]){
            return helper3(arr, target, mid + 1, end);
        } else{
            return helper3(arr, target, start, mid - 1);
        }

    }

    static void displayList (ArrayList<Integer> list){
        for (int ele : list) {
            System.out.println(ele);
        }
    }
    static void displayArray (int[] arr){
        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    static boolean isSorted(int[] arr) {

        return helper1(arr, 0);
    }
    static boolean helper1(int[] arr, int pointer) {
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

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> finalAll(int[] arr, int target, int index){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return finalAll(arr, target, index + 1);
    }
    static ArrayList<Integer> finalAllwithoutListParameter(int[] arr, int target, int index){

        ArrayList<Integer> list1 = new ArrayList<>();

        if(index == arr.length){
            return list1;
        }
        if(arr[index] == target){
            list1.add(index);
        }

        ArrayList<Integer> res = finalAllwithoutListParameter(arr, target, index + 1);

        list1.addAll(res);
        return list1;
    }


}
