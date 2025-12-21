#include<iostream>
#include<vector>
using namespace std;
int main(){
int n;
cin>>n;

int arr[n];
for(int i=0;i<n;i++){
 cin>>arr[i];

}

vector<int> ls;

for(int i=0;i<n;i++){
    if(ls.size()==0 || ls[0] != arr[i]){
        int count = 0;
        for(int j=0;j<n;j++){
            if(arr[j]==arr[i]){
                count++;
            }

        }
        
        if(count>n/3){
         ls.push_back(arr[i]);
}
    }

    if(ls.size()>2){
        break;
}




}

for(int i=0;i<ls.size();i++){
    cout<<ls[i]<<" ";

}
}

