package OlderPackage.CodeByte.AlgorithmCourse;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        Arrays.stream(twoSum(input, 9)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] < target) left++;
            else if (numbers[left] + numbers[right] > target) right--;
        }
        return result;
    }
}
