package Strings;
import java.util.Scanner;

public class Basic {
    public static void main(String args[]){

    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    // System.out.println("Your name is:" + name);


    //compare two strings

    //1 s1>s2 : +ve value
    //2 s1<s2 : -ve value
    //3 s1=s2 : 0

    String name1 = "ABC";
    String name2 = "ABC";

    if(name1.compareTo(name2) == 0){
        System.out.println("Strings are equal");

    }else{
        System.out.println("Strings are not equal");
    }

    }
    
}
