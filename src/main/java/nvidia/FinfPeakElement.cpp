
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int n = nums.size();
        int first = 0, last = n-1;

        while(first < last){
            int mid = first + (last - first) / 2;

            if(nums[mid] < nums[mid+1]){
                first = mid + 1;
            }else{
                last = mid;
            }
        }
        return first;
    }
};