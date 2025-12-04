#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the size of array: ";
    cin>>n;
    int K;
    cout<<"Enter the sum to be checked: ";
    cin>>K;
    int arr[n];
    int count=0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int sum=0;
            for(int K=i;K<j;K++){
                sum+=arr[K];
            }
            if(sum==K){
                count++;
            }
            
        }
    
    }
  cout<<count<<endl;
    return 0;

}


