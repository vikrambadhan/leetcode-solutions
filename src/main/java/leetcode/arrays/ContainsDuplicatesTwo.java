package main.java.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatesTwo {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< nums.length; i++){
            int val = nums[i];
            if(map.containsKey(val) && i - map.get(val) <= k){
                return true;
            }else{
                map.put(val, i);
            }
        }
        return false;
    }
}
