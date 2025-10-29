#include <iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
        }
        int cnt_0 = 0;
        int cnt_1 = 0;
        int cnt_2 = 0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                cnt_0++;
            }
            else if(a[i]==1){
                cnt_1++;
            }
            else{
                cnt_2++;
            }
        }
        for(int i=0;i<cnt_0;i++){
            a[i]= 0;
        }
        for(int i=cnt_0;i<cnt_0+cnt_1;i++){
            a[i]=1;
        }
        for(int i=cnt_0+cnt_1;i<n;i++){
            a[i]=2;
        }
        for(int i=0;i<n;i++){
            cout<<a[i];
        }
        return 0 ;

}