package leetcode_new.Easy;

public class MaxSubArray {


    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int i = 0, j = nums.length;
        while (i < j) {
            int sum = 0;
            for (int z = i; z < j; z++) {
                sum += nums[z];
            }
            max = Math.max(max, sum);
            j--;
            if (i == j) {
                i++;
                j = nums.length;
            }
        }
        return max;
    }
}
