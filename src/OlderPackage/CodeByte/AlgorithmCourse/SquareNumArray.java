package OlderPackage.CodeByte.AlgorithmCourse;

import java.util.Arrays;

public class SquareNumArray {

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[] sortedSquaresOP(int[] nums) {
        int left = 0, n = nums.length, right = n - 1;
        int[] result = new int[n];
        for (int index = n - 1; index >= 0; index--)
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else if (Math.abs(nums[left]) <= Math.abs(nums[right])) {
                result[index] = nums[right] * nums[right];
                right--;
            }
        return result;
    }
}
