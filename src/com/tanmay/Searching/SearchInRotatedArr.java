package com.tanmay.Searching;

public class SearchInRotatedArr {

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,0,1,2};

        System.out.println(searcher(nums, 4));
    }

    static int searcher(int[] nums, int target) {
        int ans = BS(nums, target, 0, PivotIdxFinder(nums));
        if(ans != -1){
            return ans;
        } else {
            return BS(nums, target, PivotIdxFinder(nums), nums.length);
        }

    }
    static int PivotIdxFinder(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int BS(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
