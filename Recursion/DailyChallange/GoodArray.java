package Recursion.DailyChallange;

import java.util.Arrays;

public class GoodArray {

    public static boolean isGood(int [] nums){
        Arrays.sort(nums);
        int n = nums[nums.length-1];

        if(nums.length!=n+1){
            return false;
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return false;
            }
        }
        return nums[nums.length-1]==n;

    }
     public static void main(String[] args){
        int [] nums = {1,2,3,4};
        System.out.println(GoodArray.isGood(nums));
    }
    
}


   

