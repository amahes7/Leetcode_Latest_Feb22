package leetcode_new.Medium;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {


    public static void main(String[] args) {
        int[] input = {5, 2, 1, 2, 5, 2, 1, 2, 5};
        System.out.println(maximumUniqueSubarray(input));
    }

    public static int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0, sum = 0, i = 0, j = 0;
        while (i < nums.length && j < nums.length) {
            if (!set.contains(nums[j])) {
                sum += nums[j];
                ans = Math.max(sum, ans);
                set.add(nums[j++]);
            } else {
                sum -= nums[i];
                set.remove(nums[i++]);
            }
        }
        return ans;

    }

}
