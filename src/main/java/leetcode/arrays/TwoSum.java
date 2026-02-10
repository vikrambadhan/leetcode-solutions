package main.java.leetcode.arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int comp = target - nums[i];

            if(map.containsKey(comp)){
                int arr[] = {map.get(comp), i};
                return arr;
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
