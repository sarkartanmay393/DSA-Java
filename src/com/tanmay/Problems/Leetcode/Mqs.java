package com.tanmay.Problems.Leetcode;

public class Mqs {
    public static void main(String[] args) {

        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };

        System.out.println(canCompleteCircuit(gas, cost));
    }

    

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0, current_gain = 0, answer = 0;

        for (int i = 0; i < cost.length; i++) {
            tank += gas[i] - cost[i];
            current_gain += gas[i] - cost[i];

            if (current_gain < 0) {
                answer = i + 1;
                current_gain = 0;
            }
        }

        return tank >= 0 ? answer : -1;
    }

    // failed at Time Complexity
    public static int TCcanCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int tank = gas[i];
            int nextDistance = cost[i];

            if (tank >= nextDistance) {
                int j = i + 1;
                if (j == gas.length) {
                    j = 0;
                }
                for (; j < gas.length; j++) {
                    tank = (tank - nextDistance) + gas[j];
                    nextDistance = cost[j];
                    if (tank < nextDistance) {
                        break;
                    }
                    if (j == i) {
                        return i;
                    }
                    if (j == gas.length - 1) {
                        j = 0;
                    }
                }
            }

        }

        return -1;
    }
}
