package Recursion;

public class Pow{
   public static double Pow(double x, int n){
    long N =n;
    double ans = 1.0;

    if(N<0){
        N =-1*N;
    }

    while(N>0){
        if(N%2 == 1){
            ans = ans *x;
            x=x*x;
            N = N/2;
        }
        else{
            x=x*x;
            N=N/2;
        }
    }

    if(n<0){
        ans = (double)(1.0)/(double)(ans);
    }
    return ans;
   }


   public static void main(String[] args){
    System.out.println(Pow(2.00000, -2));
   }



}