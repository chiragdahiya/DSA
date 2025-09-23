#include<iostream>
#include <vector>
using namespace std;
void insertionSort(vector<int>& arr){
 int n  = arr.size();
 for(int i=0;i<=n-1;i++){
    for(int j=i;j>0;j--){
        if(arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            cout<<"Runs"<<endl;
        }
    }
 }
}

int main(){
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    insertionSort(arr);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}

