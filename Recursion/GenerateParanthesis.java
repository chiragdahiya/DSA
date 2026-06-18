package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

    public static void solve(int open, int close, int n,
                             String curr, List<String> ans) {

        if (curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }

        if (open < n) {
            solve(open + 1, close, n, curr + "(", ans);
        }
        if (close < open) {
            solve(open, close + 1, n, curr + ")", ans);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(0, 0, n, "", ans);
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;

        List<String> result = generateParenthesis(n);

        System.out.println("Valid Parentheses Combinations:");
        for (String s : result) {
            System.out.println(s);
        }
    }
}