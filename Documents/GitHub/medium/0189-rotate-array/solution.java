// LeetCode: Rotate Array
// Problem: 189 | Difficulty: medium | Language: java
// Status: Accepted
// Problem URL: https://leetcode.com/problems/rotate-array/
// Submission URL: https://leetcode.com/problems/rotate-array/submissions/2063137334/
// Synced by LeetCode to GitHub extension
class Solution {
 
   public void reverse(int[] nums, int left, int right){
    while(left<right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
         left++;
    right--;
    }
   
   }

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k=k%n;
  //reverse full array 
  reverse(nums,0,n-1);
  //reverse k elements

  reverse(nums,0,k-1);

  //reverse the remaingin elements now

  reverse(nums,k,n-1);