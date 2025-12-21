#include<iostream>
using namespace std;

int main(){
int n;
cin>>n;
int org = n;
int rev=0;
while(n>0){
    int ld=n%10;
    rev=(rev*10)+ld;
    n=n/10;
}


if(rev==org){
    cout<<"palindrome"<<endl;
}
else{
    cout<<"not palindrome"<<endl;
}
return 0;
}