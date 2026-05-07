import java.util.*;
package Recursion;

public class First {

    public static void printNo(int n){

        if(n==0){
            return;
        }
        system.out.println(n);
        printNo(n-1);
    }



    public static void main(String[] args) {
       int n=5;
       printNo(n);
    }
    
}
