#include<iostream>
using namespace std;

int main(){
    int n, k;
  
    
    cin>>n>>k;
     k =k%n;
    int arr[n];
    
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
 int temp[k];
 //storing temp
for(int i = 0;i<k;i++){
    temp[i] = arr[i];
  
}
//iterating or shfting pointer to next to store the roated array
 for(int i=k; i<n;i++){
    arr[i-k] = arr[i];
 }
 for(int i = 0; i<k; i++){
    arr[n-k+i] = temp[i];
 }

 for(int i=0;i<n;i++){
    cout<<arr[i];
 }




}