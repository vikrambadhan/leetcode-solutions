package main.java.leetcode;

public class MaxAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        for(int i =0; i<k; i++){
            sum += nums[i];
        }
        int maxSum = sum;

        int start = 0;
        int end = k;
        while(end< nums.length){
            sum -= nums[start];
            start++;

            sum += nums[end];
            end++;

            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum/k;
    }
}
