package leetcode_new.Easy;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum = n*(n+1)/2;
        int numSum = Arrays.stream(nums).sum();
        return  sum=numSum;
    }

    public static void main(String[] args){
        MissingNumber m = new MissingNumber();
        int [] input = new int[]{3,0,1};
        System.out.println(m.missingNumber(input));
    }
}
