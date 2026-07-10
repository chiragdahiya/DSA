// LeetCode: Majority Element
// Problem: 169 | Difficulty: easy | Language: java
// Status: Accepted
// Problem URL: https://leetcode.com/problems/majority-element/
// Submission URL: https://leetcode.com/problems/majority-element/
// Synced by LeetCode to GitHub extension
class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int frequency = 0;

        for (int i = 0; i < nums.length; i++) {
            if (frequency == 0) {
                majority = nums[i];
            }

            if (nums[i] == majority) {
                frequency++;
            } else {
                frequency--;
            }
        }

        return majority;
    }
}