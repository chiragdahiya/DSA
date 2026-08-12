class Solution {
public boolean isVowel(char ch){
    return ch =='a' || ch =='e' ||ch == 'o' ||ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'U' || ch == 'O' || ch == 
    'I';
    
}

    public String reverseVowels(String s) {
        int left = 0;
        int n = s.length();
        int right = n-1;

        char[] arr = s.toCharArray();

        while(left<right){
            if(!isVowel(arr[left])){
                left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                 left++;
            right--;