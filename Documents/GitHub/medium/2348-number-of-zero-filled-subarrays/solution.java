// LeetCode: Number of Zero-Filled Subarrays
// Problem: 2348 | Difficulty: medium | Language: java
// Status: Accepted
// Problem URL: https://leetcode.com/problems/number-of-zero-filled-subarrays/
// Submission URL: https://leetcode.com/problems/number-of-zero-filled-subarrays/
// Synced by LeetCode to GitHub extension
class Solution {
    public long zeroFilledSubarray(int[] nums) {

        int n = nums.length;
        int count = 0;
        int ans = 0;

        for(int i=0;i<n;i++){
            if(nums[i]== 0){
                count++;
                ans += count;
            }else{
                count = 0;
            }
        }
        return ans;
        
    }
}