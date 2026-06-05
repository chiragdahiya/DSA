package Strings;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] s){
        int n = s.length;
        int left = 0;
        int right = n-1;

        while(left<right){
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
         System.out.println(Arrays.toString(s));
    }


    
}

