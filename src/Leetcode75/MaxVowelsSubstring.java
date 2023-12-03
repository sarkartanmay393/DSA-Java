package Leetcode75;

public class MaxVowelsSubstring {
  public static void main(String[] args) {
    System.out.println(maxVowels("LeetCode Logo\n" + //
        "LeetCode 75\n" + //
        "LeetCode 75\n" + //
        "0\n" + //
        "\n" + //
        "avatar\n" + //
        "Premium\n" + //
        "Debugging...\n" + //
        "Debugging...\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "Run\n" + //
        "Description\n" + //
        "Editorial\n" + //
        "Editorial\n" + //
        "Solutions\n" + //
        "Solutions\n" + //
        "Submissions\n" + //
        "Submissions\n" + //
        "\n" + //
        "Code\n" + //
        "\n" + //
        "Testcase\n" + //
        "Testcase\n" + //
        "Test Result\n" + //
        "\n" + //
        "1456. Maximum Number of Vowels in a Substring of Given Length\n" + //
        "Medium\n" + //
        "Topics\n" + //
        "Companies\n" + //
        "Hint\n" + //
        "Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.\n" + //
        "\n" + //
        "Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.\n" + //
        "\n" + //
        " \n" + //
        "\n" + //
        "Example 1:\n" + //
        "\n" + //
        "Input: s = \"abciiidef\", k = 3\n" + //
        "Output: 3\n" + //
        "Explanation: The substring \"iii\" contains 3 vowel letters.\n" + //
        "Example 2:\n" + //
        "\n" + //
        "Input: s = \"aeiou\", k = 2\n" + //
        "Output: 2\n" + //
        "Explanation: Any substring of length 2 contains 2 vowels.\n" + //
        "Example 3:\n" + //
        "\n" + //
        "Input: s = \"leetcode\", k = 3\n" + //
        "Output: 2\n" + //
        "Explanation: \"lee\", \"eet\" and \"ode\" contain 2 vowels.\n" + //
        " \n" + //
        "\n" + //
        "Constraints:\n" + //
        "\n" + //
        "1 <= s.length <= 105\n" + //
        "s consists of lowercase English letters.\n" + //
        "1 <= k <= s.length\n" + //
        "Seen this question in a real interview before?\n" + //
        "1/4\n" + //
        "Yes\n" + //
        "No\n" + //
        "Accepted\n" + //
        "221.2K\n" + //
        "Submissions\n" + //
        "381.6K\n" + //
        "Acceptance Rate\n" + //
        "58.0%\n" + //
        "Topics\n" + //
        "Companies\n" + //
        "Hint 1\n" + //
        "Keep a window of size k and maintain the number of vowels in it.\n" + //
        "Hint 2\n" + //
        "Similar Questions\n" + //
        "Discussion (70)\n" + //
        "\n" + //
        "Choose a type\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "Copyright \u00A9\uFE0F 2023 LeetCode All rights reserved\n" + //
        "\n" + //
        "3.2K\n" + //
        "\n" + //
        "\n" + //
        "70\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "Java\n" + //
        "Auto\n" + //
        "\n" + //
        "\n" + //
        "\n" + //
        "181716151413121110987654321\n" + //
        "            }\n" + //
        "            if (mv == k) {\n" + //
        "                return k;\n" + //
        "            }\n" + //
        "        }\n" + //
        "\n" + //
        "        return mv;\n" + //
        "    }\n" + //
        "}\n" + //
        "Saved to local\n" + //
        "Accepted\n" + //
        "Runtime: 7 ms\n" + //
        "Case 1\n" + //
        "Case 2\n" + //
        "Case 3\n" + //
        "Input\n" + //
        "s =\n" + //
        "\"leetcode\"\n" + //
        "k =\n" + //
        "3\n" + //
        "Output\n" + //
        "2\n" + //
        "Expected\n" + //
        "2\n" + //
        "Contribute a testcase\n" + //
        "Maximum Average Subarray I - LeetCode\n" + //
        "LeetCode 75\n" + //
        "\n" + //
        "Total Progress\n" + //
        "14\n" + //
        "/\n" + //
        "75\n" + //
        "Show tags\n" + //
        "Array / String\n" + //
        "1768. Merge Strings Alternately\n" + //
        "Easy\n" + //
        "\n" + //
        "1071. Greatest Common Divisor of Strings\n" + //
        "Easy\n" + //
        "\n" + //
        "1431. Kids With the Greatest Number of Candies\n" + //
        "Easy\n" + //
        "\n" + //
        "605. Can Place Flowers\n" + //
        "Easy\n" + //
        "\n" + //
        "345. Reverse Vowels of a String\n" + //
        "Easy\n" + //
        "\n" + //
        "151. Reverse Words in a String\n" + //
        "Medium\n" + //
        "\n" + //
        "238. Product of Array Except Self\n" + //
        "Medium\n" + //
        "\n" + //
        "334. Increasing Triplet Subsequence\n" + //
        "Medium\n" + //
        "\n" + //
        "443. String Compression\n" + //
        "Medium\n" + //
        "\n" + //
        "Two Pointers\n" + //
        "283. Move Zeroes\n" + //
        "Easy\n" + //
        "\n" + //
        "392. Is Subsequence\n" + //
        "Easy\n" + //
        "\n" + //
        "11. Container With Most Water\n" + //
        "Medium\n" + //
        "\n" + //
        "1679. Max Number of K-Sum Pairs\n" + //
        "Medium\n" + //
        "\n" + //
        "Sliding Window\n" + //
        "643. Maximum Average Subarray I\n" + //
        "Easy\n" + //
        "\n" + //
        "1456. Maximum Number of Vowels in a Substring of Given Length\n" + //
        "Medium\n" + //
        "\n" + //
        "1004. Max Consecutive Ones III\n" + //
        "Medium\n" + //
        "\n" + //
        "1493. Longest Subarray of 1's After Deleting One Element\n" + //
        "Medium\n" + //
        "\n" + //
        "Prefix Sum\n" + //
        "1732. Find the Highest Altitude\n" + //
        "Easy\n" + //
        "\n" + //
        "724. Find Pivot Index\n" + //
        "Easy\n" + //
        "\n" + //
        "Hash Map / Set\n" + //
        "2215. Find the Difference of Two Arrays\n" + //
        "Easy\n" + //
        "\n" + //
        "1207. Unique Number of Occurrences\n" + //
        "Easy\n" + //
        "\n" + //
        "1657. Determine if Two Strings Are Close\n" + //
        "Medium\n" + //
        "\n" + //
        "2352. Equal Row and Column Pairs\n" + //
        "Medium\n" + //
        "\n" + //
        "Stack\n" + //
        "2390. Removing Stars From a String\n" + //
        "Medium\n" + //
        "\n" + //
        "735. Asteroid Collision\n" + //
        "Medium\n" + //
        "\n" + //
        "394. Decode String\n" + //
        "Medium\n" + //
        "\n" + //
        "Queue\n" + //
        "933. Number of Recent Calls\n" + //
        "Easy\n" + //
        "\n" + //
        "649. Dota2 Senate\n" + //
        "Medium\n" + //
        "\n" + //
        "Linked List\n" + //
        "2095. Delete the Middle Node of a Linked List\n" + //
        "Medium\n" + //
        "\n" + //
        "328. Odd Even Linked List\n" + //
        "Medium\n" + //
        "\n" + //
        "206. Reverse Linked List\n" + //
        "Easy\n" + //
        "\n" + //
        "2130. Maximum Twin Sum of a Linked List\n" + //
        "Medium\n" + //
        "\n" + //
        "Binary Tree - DFS\n" + //
        "104. Maximum Depth of Binary Tree\n" + //
        "Easy\n" + //
        "\n" + //
        "872. Leaf-Similar Trees\n" + //
        "Easy\n" + //
        "\n" + //
        "1448. Count Good Nodes in Binary Tree\n" + //
        "Medium\n" + //
        "\n" + //
        "437. Path Sum III\n" + //
        "Medium\n" + //
        "\n" + //
        "1372. Longest ZigZag Path in a Binary Tree\n" + //
        "Medium\n" + //
        "\n" + //
        "236. Lowest Common Ancestor of a Binary Tree\n" + //
        "Medium\n" + //
        "\n" + //
        "Binary Tree - BFS\n" + //
        "199. Binary Tree Right Side View\n" + //
        "Medium\n" + //
        "\n" + //
        "1161. Maximum Level Sum of a Binary Tree\n" + //
        "Medium\n" + //
        "\n" + //
        "Binary Search Tree\n" + //
        "700. Search in a Binary Search Tree\n" + //
        "Easy\n" + //
        "\n" + //
        "450. Delete Node in a BST\n" + //
        "Medium\n" + //
        "\n" + //
        "Graphs - DFS\n" + //
        "841. Keys and Rooms\n" + //
        "Medium\n" + //
        "\n" + //
        "547. Number of Provinces\n" + //
        "Medium\n" + //
        "\n" + //
        "1466. Reorder Routes to Make All Paths Lead to the City Zero\n" + //
        "Medium\n" + //
        "\n" + //
        "399. Evaluate Division\n" + //
        "Medium\n" + //
        "\n" + //
        "Graphs - BFS\n" + //
        "1926. Nearest Exit from Entrance in Maze\n" + //
        "Medium\n" + //
        "\n" + //
        "994. Rotting Oranges\n" + //
        "Medium\n" + //
        "\n" + //
        "Heap / Priority Queue\n" + //
        "215. Kth Largest Element in an Array\n" + //
        "Medium\n" + //
        "\n" + //
        "2336. Smallest Number in Infinite Set\n" + //
        "Medium\n" + //
        "\n" + //
        "2542. Maximum Subsequence Score\n" + //
        "Medium\n" + //
        "\n" + //
        "2462. Total Cost to Hire K Workers\n" + //
        "Medium\n" + //
        "\n" + //
        "Binary Search\n" + //
        "374. Guess Number Higher or Lower\n" + //
        "Easy\n" + //
        "\n" + //
        "2300. Successful Pairs of Spells and Potions\n" + //
        "Medium\n" + //
        "\n" + //
        "162. Find Peak Element\n" + //
        "Medium\n" + //
        "\n" + //
        "875. Koko Eating Bananas\n" + //
        "Medium\n" + //
        "\n" + //
        "Backtracking\n" + //
        "17. Letter Combinations of a Phone Number\n" + //
        "Medium\n" + //
        "\n" + //
        "216. Combination Sum III\n" + //
        "Medium\n" + //
        "\n" + //
        "DP - 1D\n" + //
        "1137. N-th Tribonacci Number\n" + //
        "Easy\n" + //
        "\n" + //
        "746. Min Cost Climbing Stairs\n" + //
        "Easy\n" + //
        "\n" + //
        "198. House Robber\n" + //
        "Medium\n" + //
        "\n" + //
        "790. Domino and Tromino Tiling\n" + //
        "Medium\n" + //
        "\n" + //
        "DP - Multidimensional\n" + //
        "62. Unique Paths\n" + //
        "Medium\n" + //
        "\n" + //
        "1143. Longest Common Subsequence\n" + //
        "Medium\n" + //
        "\n" + //
        "714. Best Time to Buy and Sell Stock with Transaction Fee\n" + //
        "Medium\n" + //
        "\n" + //
        "72. Edit Distance\n" + //
        "Medium\n" + //
        "\n" + //
        "Bit Manipulation\n" + //
        "338. Counting Bits\n" + //
        "Easy\n" + //
        "\n" + //
        "136. Single Number\n" + //
        "Easy\n" + //
        "\n" + //
        "1318. Minimum Flips to Make a OR b Equal to c\n" + //
        "Medium\n" + //
        "\n" + //
        "Trie\n" + //
        "208. Implement Trie (Prefix Tree)\n" + //
        "Medium\n" + //
        "\n" + //
        "1268. Search Suggestions System\n" + //
        "Medium\n" + //
        "\n" + //
        "Intervals\n" + //
        "435. Non-overlapping Intervals\n" + //
        "Medium\n" + //
        "\n" + //
        "452. Minimum Number of Arrows to Burst Balloons\n" + //
        "Medium\n" + //
        "\n" + //
        "Monotonic Stack\n" + //
        "739. Daily Temperatures\n" + //
        "Medium\n" + //
        "\n" + //
        "901. Online Stock Span\n" + //
        "Medium\n" + //
        "\n" + //
        "", 20));
  }

  public static int maxVowels(String s, int k) {
    String vowels = "AEIOUaeiou";
    int n = s.length();

    int mv = 0;
    int v = 0;

    String fw = "";
    for (int i = 0; i < k; i++) {
      fw += s.charAt(i);
    }
    for (int i = 0; i < fw.length(); i++) {
      if (vowels.indexOf(fw.charAt(i)) != -1) {
        v++;
      }
    }

    mv = Math.max(mv, v);
    if (mv == k) {
      return k;
    }
    for (int i = k; i < n; i++) {
      if (v < k && vowels.indexOf(s.charAt(i - k)) != -1) {
        v--;
        mv = Math.max(mv, v);
      }
      if (v < k && vowels.indexOf(s.charAt(i)) != -1) {
        v++;
        mv = Math.max(mv, v);
      }
      if (mv == k) {
        return k;
      }
    }

    return mv;
  }

}
