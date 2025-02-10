#include<iostream>
#include<climits>
using namespace std;

int main(){
    int n;
    cin>>n;
    int mx=INT_MIN;
    int mn=INT_MAX;

    int a[n];
    n=sizeof(a)/sizeof(a[0]);

    for(int i=0;i<n;i++){
        cin>>a[i];
    }

    for(int i=0;i<n;i++){
        if(a[i]>mx){
            mx=a[i];

            
        }
    }
        for(int i=0;i<n;i++){
            if(a[i]<mn){
                mn=a[i];
            }
           
        }
        cout<<"max element in an array is :"<<mx<<endl;
        cout<<"min element in an array is :"<<mn;

    
}