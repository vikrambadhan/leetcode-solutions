#include <vector>
#include <unordered_map>
#include <iostream>
#include <algorithm>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> numMap;
        int n = nums.size();

        for(int i = 0; i< n; i++){
            numMap[nums[i]] = i;
        }

        for(int i = 0; i< n; i++){
            int compliment = target - nums[i];
            if(numMap.count(compliment) && numMap[compliment] != i){
                return {i, numMap[compliment]};
            }
        }
        return {};
    }
};