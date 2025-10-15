#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int j = -1; //to place j at  0 element in an array
    for(int i=0;i<n;i++){
        if(arr[i] == 0){ // in array while iterating  where we found array will point j to that index
          j =i;
            break;
        }
    }

   
        if(j == -1){
             for(int i=0;i<n;i++){
            cout<<arr[i]<<" ";
        }
        return 0;
    }



  
    for(int i=j+1;i<n;i++){    //i always start next to j so that's why j+1
        if(arr[i]!=0){
           swap(arr[i], arr[j]);
        j++;
        
        }

     
    }


    for(int i=0;i<n;i++){
        cout<<arr[i];
    }
}