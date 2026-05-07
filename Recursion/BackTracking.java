package Recursion;

public class BackTracking {

    public static void reverseB(int i, int n){
        if(i>n){
            return;
        }
        reverseB(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args){
        reverseB(1,10);
    }
    
}
