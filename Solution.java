class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int frequency = 0;

        for (int i = 0; i < nums.length; i++) {
            if (frequency == 0) {
                majority = nums[i];
            }

            if (nums[i] == majority) {
                frequency++;
            } else {
                frequency--;
            }
        }

        return majority;
    }
}