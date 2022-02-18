package Feb22Practise.LeetcodeAlgo;

import Feb22Practise.LeetcodeDS1.TwoSum;

import java.util.Arrays;

public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {
        int index = 0, pos = 0;
        while (pos < nums.length) {
            if (nums[pos] != 0) {
                nums[index] = nums[pos];
                index++;
                pos++;
            } else {
                pos++;
            }
        }
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
        return nums;
    }

    public static void main(String[] args) {
        MoveZeroes MoveZeroes = new MoveZeroes();
        int[] input = new int[]{0, 1, 0, 3, 12};
        Arrays.stream(MoveZeroes.moveZeroes(input)).forEach(System.out::println);
    }
}
