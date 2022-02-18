package leetcode_new.Medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class KthLargestElementinanArray {

    public int findKthLargest(int[] nums, int k) {
        int[] result =Arrays.stream(nums).sorted().toArray();
        return result[nums.length-k];
    }
}
