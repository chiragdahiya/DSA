#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int a[n];
    n=sizeof(a)/sizeof(a[0]);

    for(int i=0;i<n;i++){
        cin>>a[i];
    }
     int i=0;
     int j=n-1;
      while(i<j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
     }
     for(int i=0;i<n;i++){
        cout<<a[i]<<endl;
     }
     cout<<endl;
}