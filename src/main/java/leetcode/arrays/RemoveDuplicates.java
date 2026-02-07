package main.java.leetcode.arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int writePos =0;

        for(int readPos =1; readPos < nums.length; readPos++){
            if(nums[readPos] != nums[writePos]){
                writePos++;
                nums[writePos] = nums[readPos];
            }
        }
        return writePos +1;
    }
}
