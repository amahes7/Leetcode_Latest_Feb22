package TopInterviewQuestions.Easy.Array;


import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] p = new int[]{2, 7, 11, 15};
        System.out.println(twoSum(p, 26));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int[] result = new int[2];
        while (i < nums.length) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
                j++;
            }
            i++;
        }
        return result;
    }
}
