package Recursion;

public class Linearly {

    public static void printlinearly(int i, int n){

        if(i>n){
            return;
        }
        System.out.println(i);
        printlinearly(i+1, n);
    }
    public static void main(String[] args) {
        printlinearly(1,10);
    }
}
