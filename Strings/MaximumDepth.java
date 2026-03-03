package Strings;

public class MaximumDepth {

    public static void main(String[] args) {
        String s = "((1)+(2))";

        int count = 0;
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
                ans = Math.max(ans, count);
            } 
            else if (ch == ')') {
                count--;
            }
        }

        System.out.println("Maximum Depth: " + ans);
    }
}