package Leetcode.AmazonEasy;

public class RunningSum {

    public int[] runningSum(int[] nums) {
        int count = nums.length;
        int [] result = new int[count];
        result[0]= nums[0];
        for(int i=1;i<count;i++){
            result[i]= result[i-1]+ nums[i];
        }
        return result;
    }
}
