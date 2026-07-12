// LeetCode: Add Digits
// Problem: 258 | Difficulty: easy | Language: java
// Status: Accepted
// Problem URL: https://leetcode.com/problems/add-digits/
// Submission URL: https://leetcode.com/problems/add-digits/
// Synced by LeetCode to GitHub extension
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum = 0;

            while(num>0){
                sum += num %10;
                num/=10;
            }

            num =sum;
        }

        return num;
    }
}