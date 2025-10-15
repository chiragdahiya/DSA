#include<iostream>
using namespace std;

int main(){
    int n,nums;
    cin>>n>>nums;
    int arr[n];

    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    for(int i=0;i<n;i++){
        if(arr[i]==nums){
           cout<< i <<endl;
           return 0;
        }
       
           
   
    }
    cout<< -1 <<endl;
    return 0;
 
}