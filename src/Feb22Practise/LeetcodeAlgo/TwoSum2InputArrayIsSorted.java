package Feb22Practise.LeetcodeAlgo;

import leetcode_new.Easy.ThirdMaximumNumber;

import java.util.Arrays;

public class TwoSum2InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        int[] result = new int[2];
        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (numbers[start] + numbers[end] > target) end--;
            else if (numbers[start] + numbers[end] < target) start++;
        }
        return result;
    }


    public static void main(String[] args) {
        TwoSum2InputArrayIsSorted TwoSum2InputArrayIsSorted = new TwoSum2InputArrayIsSorted();
        int[] input = new int[]{2, 7, 11, 15};
        Arrays.stream(TwoSum2InputArrayIsSorted.twoSum(input, 9)).forEach(System.out::print);
    }
}
