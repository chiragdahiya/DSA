#include <iostream>
#include<vector>
#include<set>
#include<algorithm>
using namespace std;

vector<vector<int>> fourSum(vector<int>& nums, int target){
    set<vector<int>> st;
    int n= nums.size();

    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                for(int q=k+1;q<n;q++){
                    int sum = int(nums[i]) + nums[j] + nums[k] + nums[q];
                    if(sum==target){
                        vector<int> temp = {nums[i], nums[j], nums[k], nums[q]};
                        sort(temp.begin(), temp.end());
                        st.insert(temp);
                }

            }
        }
    }
}

return vector<vector<int>>(st.begin(), st.end());
}

int main(){

    vector<int> nums = {1,0,-1,0,-2,2};
    int target = 0;

    vector<vector<int>> result = fourSum(nums, target);

    for(auto &quad: result){
        for(int x: quad){
            cout<<x<<" ";
        }   
        cout<<endl; 
    }

}