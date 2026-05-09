package Recursion;

public class SumOfN {

    public static void SumOfN(int n, int sum){
        if(n<1){
             System.out.println(sum);
            return;
        }
      
        SumOfN(n-1, sum+n);
         

    }

  public static void main(String[] args){

    SumOfN(5, 0);
  }
    
}
