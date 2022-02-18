package leetcode_new.Medium;

import java.util.*;

public class SubsetsII {

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        System.out.println(subsetsWithDup(input));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> tmp = new ArrayList<>();
            for (List<Integer> res : result) {
                List<Integer> list = new ArrayList<>(res);
                list.add(nums[i]);
                if (!result.contains(list)) {
                    tmp.add(list);
                }
            }
            result.addAll(tmp);

        }
        return result;
    }
}
