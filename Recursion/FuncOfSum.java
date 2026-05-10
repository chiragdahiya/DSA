package Recursion;

public class FuncOfSum {

    public static void SumF(int n, int sum){

        if(n==0){
           System.out.println(sum);
            return;
        }
       SumF(n - 1, sum + n);

    }

    public static void main(String[] args){
        SumF(5, 0);
    }
    
}
