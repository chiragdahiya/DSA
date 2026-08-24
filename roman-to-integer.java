class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        
        Map<Character, Integer> Values = new HashMap<>();

        Values.put('I', 1); 
        Values.put('V', 5);
         Values.put('X', 10); Values.put('L', 50);
        Values.put('C', 100); Values.put('D', 500); Values.put('M', 1000);

        int total = 0;
        int largestSeen = 0;

        for(int i=n-1; i>=0; i--){
            int value = Values.get(s.charAt(i));

            if(value < largestSeen){
                total -= value;
            }
            else{
                total += value;
                largestSeen = value;
            }
        }
        return total;
    }
}