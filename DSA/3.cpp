#include <iostream>
#include <queue>
#include <vector>

using namespace std;

int kthSmallest(vector<int>& arr, int k) {
    priority_queue<int> maxHeap; 

    for (int i = 0; i < k; i++) 
        maxHeap.push(arr[i]);  

    for (int i = k; i < arr.size(); i++) {
        if (arr[i] < maxHeap.top()) {  
            maxHeap.pop();  
            maxHeap.push(arr[i]);  
        }
    }
    
    return maxHeap.top(); 
}

int main() {
    vector<int> arr = {7, 10, 4, 3, 20, 15};
    int k = 3;
    cout << "Kth smallest element is " << kthSmallest(arr, k) << endl;
    return 0;
}
