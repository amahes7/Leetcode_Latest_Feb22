package TopInterviewQuestions.Easy.Array;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] p = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(p));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            res.add(nums[i]);
        }
        if (nums.length == res.size()) return true;
        else return false;

    }
}
