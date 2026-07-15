// LeetCode: Fizz Buzz
// Problem: 412 | Difficulty: easy | Language: java
// Status: Accepted
// Problem URL: https://leetcode.com/problems/fizz-buzz/
// Submission URL: https://leetcode.com/problems/fizz-buzz/submissions/2068907583/
// Synced by LeetCode to GitHub extension
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                answer.add("Fizz");
            } 
            else if (i % 5 == 0) {
                answer.add("Buzz");
            } 
            else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}