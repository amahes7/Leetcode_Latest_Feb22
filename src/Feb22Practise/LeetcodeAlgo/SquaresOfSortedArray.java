package Feb22Practise.LeetcodeAlgo;

import Feb22Practise.DP.Tribonacci;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int count = nums.length;
        int[] result = new int[count];
        int left = 0, right = count - 1;
        for (int index = count - 1; index >= 0; index--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else if (Math.abs(nums[left]) <= Math.abs(nums[right])) {
                result[index] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray SquaresOfSortedArray = new SquaresOfSortedArray();
        int[] input = new int[]{-4, -1, 0, 3, 10};
        Arrays.stream(SquaresOfSortedArray.sortedSquares(input)).forEach(System.out::println);
    }
}
