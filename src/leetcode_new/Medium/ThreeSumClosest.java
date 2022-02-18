package leetcode_new.Medium;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] input = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(input, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length && diff != 0 ; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum < target) start++;
                else end--;
            }
        }
        return target - diff;


    }

}
