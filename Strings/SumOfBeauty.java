package Strings;

import java.util.Scanner;

public class SumOfBeauty {
    public static int beautySum(String s) {
        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];

            for (int j = i; j < n; j++) {

                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                result += maxFreq - minFreq;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = beautySum(s);

        System.out.println("Sum of Beauty of all substrings: " + result);

        sc.close();
}
}
