class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;

        for(int step=0;step<k;step++){
            int last = nums[n-1];
            for(int i = n-1;i>0;i--){
                nums[i] = nums[i-1];
            }
               nums[0]=last;
        }
     
        
    }
}