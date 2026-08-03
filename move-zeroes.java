class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int insert = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                if(insert!=i){
                    int temp = nums[insert];
                    nums[insert] = nums[i];
                    nums[i] = temp;
                }
                insert++;
            }
        }
        
        
    }
}