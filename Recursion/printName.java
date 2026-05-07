package Recursion;
public class printName {

    public static void printN(int n){

        if(n==0){
            return;
        }
        System.out.println("Chirag");
        printN(n-1);


    }


    public static void main(String[] args){
        printN(5);
    }
    
}
