class Solution {
    public int firstMissingPositive(int[] nums) {
         Set<Integer> present = new HashSet<>();               
        for (int num : nums) present.add(num);
        int candidate = 1;
        while (present.contains(candidate)) candidate++;
        return candidate;
    
        
    }
}