#include<iostream>
using namespace std;

int rev(int n){
    int rs=0;
    while(n>0){
        int ld=n%10;
        rs=(rs*10)+ld;
        n=n/10;
    }
    return rs;
}
int main(){
    int n;
    cin>>n;
    cout<<rev(n)<<endl;
}