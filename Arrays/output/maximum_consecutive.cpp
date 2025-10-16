#include<iostream>
using namespace std;
int  main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int max_count=0;
    int count=0;

    for(int i=0;i<n;i++){
        if(arr[i]==1){
            count++;
            max_count=max(max_count,count);
        }
        else{
            count=0;
        }
    }

    cout<<max_count;



}