class Solution {

 public boolean isSubString(String t, String p){
    int n = t.length();
    int m = p.length();

    for(int i=0;i<=n-m;i++){
        int j=0;

        while(j<m &&t.charAt(i + j) == p.charAt(j)){
            j++;
        

        if(j==m){
            return true;
        }

       
    }
   
 }
   return false;
 }

    public int repeatedStringMatch(String a, String b) {

        StringBuilder s = new StringBuilder();
        int count = 0;