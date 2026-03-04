package Strings;

import java.util.HashMap;
import java.util.Map;

public class romanInteger {
    public static void main(String[] args){
        String s = "LVIII";

        int n = s.length();
        int ans = 0;
  
         Map<Character, Integer> roman = new HashMap<>();
         roman.put('I', 1);
         roman.put('V', 5);
         roman.put('X', 10);
         roman.put('L', 50);
         roman.put('C', 100);
         roman.put('D', 500);
         roman.put('M', 1000);    


         for(int i=0;i<n-1;i++){
            if(roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))){
                ans -= roman.get(s.charAt(i));
            }else{
                ans += roman.get(s.charAt(i));

         }
    }
   ans += roman.get(s.charAt(n-1));
   System.out.println(ans);
}
    
}
