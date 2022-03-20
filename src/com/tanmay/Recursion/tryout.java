package com.tanmay.Recursion;

import java.util.*;

public class tryout {

    public static void main(String[] args) {

        ArrayList<Integer> res = new ArrayList<>();
        res.add(16);res.add(17);res.add(4);
        res.add(3);res.add(5);res.add(2);

        int[] res1 = {16,17,4,3,5,2};

        display(leaders(res1, 6));

    }

    static void display(ArrayList<Integer> leaders){
        for (int i = 0; i < leaders.size(); i++) {
            System.out.println(leaders.get(i));
        }
    }

    static ArrayList<Integer> leaders(int arr[], int n){

        int currLeader = 0;
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = n-1; i >= 0; i--){
            if(i==n-1){
                res.add(arr[i]);
                currLeader = arr[i];
                continue;
            }

            if(arr[i] >= currLeader){
                res.add(arr[i]);
                continue;
            }

        }
        Collections.reverse(res);
        return res;
    }

}