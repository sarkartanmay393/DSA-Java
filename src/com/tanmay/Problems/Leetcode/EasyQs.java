package com.tanmay.Problems.Leetcode;

import java.util.Arrays;

public class EasyQs {
    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[] { 1, 2, 3, 4 }));
    }

    //
    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] ans = new int[nums.length];
        for (int n : nums) {
            product *= n;
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = product / nums[i];
        }


        return ans;
    }

    // Citations calcution
    public static int hIndex(int[] citations) {
        int hIndex = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] > citations.length - i - 1) {
                hIndex++;
            }
        }

        return hIndex;
    }

    //
    public static int jump(int[] nums) {
        int jumps = 0;
        int maxSteps = 0;
        int currentEnd = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxSteps = Math.max(maxSteps, i + nums[i]);

            if (i == currentEnd) {
                currentEnd = maxSteps;
                jumps++;
            }
        }

        return jumps;
    }

    public static boolean canJump(int[] nums) {
        boolean canJump = false;
        int stepsLeft = nums[0];

        for (int i = 1; i < nums.length; i++) {
            stepsLeft = Math.max(stepsLeft - 1, nums[i]);

            if (i == nums.length - 1) {
                return true;
            }

            if (stepsLeft <= 0) {
                break;
            }
        }

        return canJump;
    }

    // Reverse any array
    static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int tmp = nums[s];
            nums[s] = nums[e];
            nums[e] = tmp;

            s++;
            e--;
        }
    }

    // O(n), O(1)
    public static void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        for (int n : nums) {
            System.out.print(n + ", ");
        }
    }

    // using extra space
    public static void rotateX(int[] nums, int k) {
        int index = 0;
        int kCLone = k;
        int[] toSilderRight = new int[nums.length - k];

        for (int i = 0; i < nums.length - k; i++) {
            toSilderRight[i] = nums[i];
        }

        while (kCLone > 0) {
            nums[index++] = nums[nums.length - kCLone];
            kCLone--;
        }

        for (int i = 0; i < toSilderRight.length; i++) {
            nums[index++] = toSilderRight[i];
        }

        for (int n : nums) {
            System.out.print(n + ", ");
        }
    }

    // Two pointers methods
    public static int removeDuplicates(int[] nums) {
        int count = 0, index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 0;
            }

            if (count <= 1) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    // Two pointers methods
    public static int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}