package Feb22Practise.LeetcodeDS1;

import Feb22Practise.LeetcodeAlgo.SquaresOfSortedArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i] - target);
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum TwoSum = new TwoSum();
        int[] input = new int[]{3, 2, 4};
        Arrays.stream(TwoSum.twoSum(input, 6)).forEach(System.out::println);
    }
}
