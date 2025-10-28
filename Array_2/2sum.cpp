#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int arr[n];
    int k;
    cin>>k;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i] + arr[j] == k){
                cout<<i<<" "<<j<<endl;
                cout<<"YES";
                return 0;
               
            }
           
        }
      
    }
    cout<<"No";
    return 0;
}
