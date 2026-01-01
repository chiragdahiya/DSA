#include<iostream>
#include<vector>
using namespace std;

int binarySearch(vector<int>& arr, int target){
    int n = arr.size();
    int low = 0;
    int high = n - 1;

    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] <target){
            low= mid+1;
        }
        else{
            high = mid - 1;
        }
    }
    return -1;

}

   int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    vector<int> arr(n);
    cout << "Enter " << n << " sorted elements:\n";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int target;
    cout << "Enter target value to search: ";
    cin >> target;

    int result = binarySearch(arr, target);

    if (result != -1) {
        cout << "Element found at index: " << result << endl;
    } else {
        cout << "Element not found in the array." << endl;
    }

    return 0;
}
