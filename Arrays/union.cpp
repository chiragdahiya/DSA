#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n1, n2;
    cin >> n1;
    vector<int> arr1(n1);
    for (int i = 0; i < n1; i++) {
        cin >> arr1[i];
    }

    cin >> n2;
    vector<int> arr2(n2);
    for (int i = 0; i < n2; i++) {
        cin >> arr2[i];
    }
    vector<int> result;
    int i = 0, j = 0;

while(i<n1 && j<n2){
    if(arr1[i]<=arr2[j]){
        if(result.size() == 0 || result.back() !=arr1[i]){
            result.push_back(arr1[i]);
        }
        i++;
    }

        else{
            if(result.size() == 0 || result.back() !=arr2[j]){
                result.push_back(arr2[j]);
            }
            j++;
        }
        
    }

while(i<n1){
        if(result.size() == 0 || result.back() !=arr1[i]){
            result.push_back(arr1[i]);
        }
        i++;
    }



while(j<n2){
     if(result.size() == 0 || result.back() !=arr2[j]){
                result.push_back(arr2[j]);
            }
            j++;

}
    

    for (int num : result) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
