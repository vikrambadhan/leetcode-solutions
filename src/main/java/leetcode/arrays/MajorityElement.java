package main.java.leetcode.arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 0;
        for(int num : nums){
            if(majority == num){
                votes++;
            }else if(votes == 0){
                majority = num;
                votes++;
            }else{
                votes--;
            }
        }
        return majority;
    }


}
