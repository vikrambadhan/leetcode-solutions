#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double sum =0;

        for(int i =0; i<k; i++){
            sum += nums[i];
        }
        double maxSum = sum;

        int start = 0;
        int end = k;
        while(end< nums.size()){
            sum -= nums[start];
            start++;

            sum += nums[end];
            end++;

            maxSum = max(maxSum, sum);
        }

        return maxSum/k;
    }
};