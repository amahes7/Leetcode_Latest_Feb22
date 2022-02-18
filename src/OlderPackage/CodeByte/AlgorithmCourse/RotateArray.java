package OlderPackage.CodeByte.AlgorithmCourse;

import java.util.Arrays;

public class RotateArray {


    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        Arrays.stream(rotateArray(input, 3)).forEach(System.out::println);
    }

    // O(1) Space
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            rightRotatebyOne(nums, n);
        }
        return nums;
    }

    private static void rightRotatebyOne(int[] nums, int n) {
        int temp = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = temp;
    }

    //O(N) Time
    private static int[] rotateArray(int[] nums, int k) {
        int[] temp = new int[k];
        int n = nums.length;
        if (k < 0 || k == n) return nums;
        if(k>n) k= k%n;

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
        return nums;
    }
}
