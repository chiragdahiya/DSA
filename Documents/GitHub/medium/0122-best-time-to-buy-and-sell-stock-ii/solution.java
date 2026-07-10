// LeetCode: Best Time to Buy and Sell Stock II
// Problem: 122 | Difficulty: medium | Language: java
// Status: Accepted
// Problem URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Submission URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Synced by LeetCode to GitHub extension
class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;

        int profit = 0;

        for(int i =1; i<n;i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
        
    }
}