// LeetCode: Increasing Triplet Subsequence
// Problem: 334 | Difficulty: medium | Language: java
// Status: Accepted
// Problem URL: https://leetcode.com/problems/increasing-triplet-subsequence/
// Submission URL: https://leetcode.com/problems/increasing-triplet-subsequence/submissions/2065293793/
// Synced by LeetCode to GitHub extension
class Solution {
    public boolean increasingTriplet(int[] nums) {

        int n = nums.length;
        int first = Integer.MAX_VALUE;
        int second =Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i] <= first){
                first =nums[i];
            }else if(nums[i] <= second){
                second = nums[i];
            }
            else{
             return true;
            }
        }
        return false;
        
    }
}