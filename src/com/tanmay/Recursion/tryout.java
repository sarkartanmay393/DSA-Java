package com.tanmay.Recursion;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class tryout {

    public static void main(String[] args) {

//        ArrayList<Integer> res = new ArrayList<>();
//        res.add(16);res.add(17);res.add(4);
//        res.add(3);res.add(5);res.add(2);
//
//        //var ajsnfh =
//        int[] res1 = {16,17,4,3,5,2};
//        int[] res2 = {37,12,28,9,100,56,80,5,12};
//
//        String exp ="!(&(!(&(f)),&(t),|(f,f,t)))";
//        System.out.println("!(&(!(&(f)),&(t),|(f,f,t)))");
//        System.out.println(parseBoolExpr(exp));

        System.out.println(helper(new int[]{1,1,1,1,1}, 3, 0, 0));

        //display(leaders(res1, 6));
    }

    // Leetcode
    public static int helper(int[] nums, int target, int sum, int t){
        if(t == nums.length - 1){
            if(sum == target){
                return 1;
            }
            return 0;
        }


        int count = 0;
        for(int i=0; i<nums.length; i++){
            count = count + helper(nums, target, sum + nums[i], t+1);
            count = count + helper(nums, target, sum - nums[i], t+1);

        }

        return count;
    }





    public static boolean parseBoolExpr(String expr) {
        if(expr.charAt(0) == '!' && expr.charAt(2) == 't'){
            return !true;
        } else if(expr.charAt(0) == '!' && expr.charAt(2) == 'f'){
            return !false;
        }
        return helper(expr, expr.charAt(0), 2,  0);
    }
    static boolean res;
    public static boolean helper(String exp, char lastO, int pointer, int tracker){
        if(pointer == exp.length()) {
            return res;
        }
        if(tracker < 1 && (exp.charAt(pointer) == 'f' || exp.charAt(pointer) == 't')){
            res = exp.charAt(pointer) == 'f' ? false : true;
            if(lastO == '|'){
                res |= helper(exp, lastO, pointer+2,tracker+1);
            } else if( lastO == '&'){
                res &= helper(exp, lastO, pointer+1,tracker+1);
            }
        } //first bool for res
        if(exp.charAt(pointer) == ','){
            if(lastO == '|'){
                res |= helper(exp, lastO, pointer+1,tracker);
            } else if( lastO == '&'){
                res &= helper(exp, lastO, pointer+1,tracker);
            }
        }
        if(exp.charAt(pointer) == '|' ||
                exp.charAt(pointer) == '&' ||
                exp.charAt(pointer) == '!') {

            if(lastO == '|' && tracker != 0){
                res |= helper(exp, exp.charAt(pointer), pointer+2, tracker--);
            } else if(lastO == '&' && tracker != 0){
                res &= helper(exp, exp.charAt(pointer), pointer+2, tracker--);
            }

            if(tracker == 0 && lastO == '|'){
                res = helper(exp, exp.charAt(pointer), pointer+2, tracker);
            }

        }

        if(exp.charAt(pointer) == 'f') {
            if (lastO == '!') {
                return true;
            } else if (lastO == '&') {
                res &= false;
                //lastO = exp.charAt(pointer);
                res &= helper(exp, lastO, pointer + 2,tracker);
            } else if (lastO == '|') {
                res |= false;
                //lastO = exp.charAt(pointer);
                res |= helper(exp, lastO, pointer + 2,tracker);
            }
        }

        if(exp.charAt(pointer) == 't') {
            if (lastO == '!') {
                return false;
            } else if (lastO == '&') {
                res &= true;
                //lastO = exp.charAt(pointer);
                res &= helper(exp, lastO, pointer + 2, tracker);
            } else if (lastO == '|') {
                res |= true;
                //lastO = exp.charAt(pointer);
                res |= helper(exp, lastO, pointer + 2,tracker);
            }
        }
        return res;

    }
}