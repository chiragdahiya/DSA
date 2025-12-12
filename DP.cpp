#include<iostream>
#include <vector>
#include <climits>
using  namespace std;
int main(){
    int n;
    cin>>n;
   vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int maxi=INT_MIN;
    vector<int> result;
    for(int i=n-1;i>0;i--){
        if(arr[i]>maxi){
            result.push_back(arr[i]);
        }
        maxi=max(maxi,arr[i]);
    }
     for (int i = result.size() - 1; i >= 0; i--) {
        cout << result[i] << " ";
    }
}