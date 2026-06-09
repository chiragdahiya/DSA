package Strings;

public class columnNumber {
    public static int titleToNumber(String col){

        int sum =0;
        int pow = 0;

        int n = col.length();

        for(int i=n-1;i>=0;i--){
            int temp = col.charAt(i) -64;
            sum += temp * Math.pow(26,pow++);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(columnNumber.titleToNumber("AB"));
    }
    
}
