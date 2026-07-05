// LeetCode: Remove Duplicates from Sorted Array
// Problem: 26 | Difficulty: easy | Language: java
// Status: Accepted
// Problem URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Submission URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/2057208465/
// Synced by LeetCode to GitHub extension
class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}