package Recursion;

public class Reversearray {

    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void reverseA(int i, int arr[], int n){
        if(i>=n/2){
            return ;
        }
           swap(i,n-i-1);
            reverseA(i+1, arr, n);
        
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        reverseA(0, arr, n);
        System.out.println("Reversed array: ");
        for(int x: arr){
            System.out.print(x + " ");
        }

    }



    
}
