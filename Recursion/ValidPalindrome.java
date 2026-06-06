package Recursion;
public class ValidPalindrome {
public static boolean isP(String s, int i){
    int n=s.length();
    if(i>=n/2){
        return true;
    }
    if(s.charAt(i)!=s.charAt(n-i-1)){
        return false;

    }
    return isP(s,i+1);
}



    public static void main(String[] args){
        String s= "MADAM";
        if(isP(s,0)){
            System.err.println("The string is a palindrome");
        }else{

        
        System.err.println("The string is not a palindrome");
        }
    }
}
    

