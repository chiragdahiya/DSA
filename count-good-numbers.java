class Solution {

   static long MOD = 1000000007;

  public long solve(long x, long n){

    if(n == 0){
        return 1;
    }

    long half = solve(x,n/2);
    long result = (half*half) %MOD;

    if(n%2 ==1 ){
        result = (result*x)%MOD;
    }
    return result;

  }

    public int countGoodNumbers(long n) {

        long even = (n+1) /2;
        long odd = n/2;

        long evenWays = solve(5,even);
        long oddWays = solve(4,odd);
        return (int)((evenWays * oddWays)% MOD);