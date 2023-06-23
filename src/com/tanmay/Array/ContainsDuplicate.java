package com.tanmay.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> helperDatabase = new HashSet<>();

        // We could use arraylist too.
        for (int num : nums) {
            if (helperDatabase.contains(num)) {
                return true;
            } else {
                helperDatabase.add(num);
            }
        }
        return false;
    }
}

class RandomizedSet {
    ArrayList<Integer> set;

    public RandomizedSet() {
        this.set = new ArrayList<Integer>();
    }

    public boolean insert(int val) {
        if (!set.contains(val)) {
            set.add(val);
            return true;
        }

        return false;
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(set.indexOf(val));
            return true;
        }

        return false;
    }

    public int getRandom() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(set.size());
        
        return set.get((randomIndex));
    }
}
