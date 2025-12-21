#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    if(n>=90){
        cout<<"Grade A"<<endl;

    }
    else if(n>=70){
        cout<<"grade b"<<endl;
    }
    else if(n>=50){
        cout<<"grade c"<<endl;
    }
    else if(n>=35){
        cout<<"grafe d" <<endl;
    }
    else{
        cout<<"fail"<<endl;
    }

    return 0;
    
}
