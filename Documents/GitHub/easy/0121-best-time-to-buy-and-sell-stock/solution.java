// LeetCode: Best Time to Buy and Sell Stock
// Problem: 121 | Difficulty: easy | Language: java
// Status: Accepted
// Problem URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Submission URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Synced by LeetCode to GitHub extension
class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int maxP = 0;
        int n = prices.length;

        for(int sell = 1; sell<n; sell++){
            if(prices[sell] > prices [buy]){
                maxP = Math.max(maxP, prices[sell] - prices[buy]);
            }
            else{
                buy = sell;
            }
        }

        return maxP;
        
    }
}