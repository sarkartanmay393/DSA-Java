package Leetcode75;

class MoveZeros {
  public static void main(String[] args) {
    int[] nums = { 1, 0, 0, 0, 3, 0, 5 };
    moveZeroes(nums);
  }

  public static void moveZeroes(int[] nums) {
    int n = nums.length, lp, rp = 1;
    lp = rp - 1;

    if (n == 1) {
      return;
    }

    while (lp <= rp) {
      if (rp >= n) {
        return;
      }
      if (nums[lp] != 0) {
        lp++;
        if (nums[rp] != 0) {
          rp++;
        }
      } else if (nums[lp] == 0 && nums[rp] != 0) {
        swap(nums, lp, rp);
        lp++;
        rp++;
      } else if (nums[lp] == 0 && nums[rp] == 0) {
        rp++;
      } else if (nums[rp] == 0) {
        rp++;
      }
    }
  }

  public static void swap(int[] nums, int a, int b) {
    nums[a] = nums[a] ^ nums[b];
    nums[b] = nums[a] ^ nums[b];
    nums[a] = nums[a] ^ nums[b];
  }
}