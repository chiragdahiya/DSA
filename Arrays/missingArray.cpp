#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    for(int i=1;i<n;i++){
        
    int count = 0;
        for(int j=0;j<n-1;j++){
            if(arr[j]==i){

         
                count = 1;
                break;
                   }
        }

        if( count == 0){
            cout<<i;
            break;
        }
            
          

            
        }
        return 0;

      
    }
