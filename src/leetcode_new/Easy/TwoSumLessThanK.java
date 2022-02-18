package leetcode_new.Easy;

import java.util.Arrays;

public class TwoSumLessThanK {

    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int sum = Integer.MIN_VALUE;
        while (left < right) {
            if (nums[left] + nums[right] < k) {
                sum=Math.max(sum, nums[left] + nums[right]);
                left++;
            } else right--;
        }
        return sum;

    }


    public static void main(String[] args) {
        TwoSumLessThanK TwoSumLessThanK = new TwoSumLessThanK();
        int[] input = new int[]{34, 23, 1, 24, 75, 33, 54, 8};
        System.out.println(TwoSumLessThanK.twoSumLessThanK(input, 60));
    }
}
