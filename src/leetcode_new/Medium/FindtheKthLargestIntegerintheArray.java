package leetcode_new.Medium;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindtheKthLargestIntegerintheArray {

    public String kthLargestNumber(String[] nums, int k) {
        return String.valueOf(Arrays.stream(nums).map(BigInteger::new).sorted().collect(Collectors.toList()).get(nums.length-k));
    }
}

//Input: nums = ["3","6","7","10"], k = 4
//Output: "3"
