//Boyer-Moore appraoch

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int dig = 0;

        for(int i =0;i<n;i++){
            if(count == 0){
                dig = nums[i];
            }

            if(nums[i] == dig){
                count++;
            }
            else{
                count--;
            }
            
            }
            return dig;
        }