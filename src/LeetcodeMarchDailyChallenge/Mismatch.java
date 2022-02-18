package LeetcodeMarchDailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Mismatch {

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    result[0] = i;
                }
            } else {
                result[1] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Mismatch mismatch = new Mismatch();
        int arr[] = {3, 2, 3, 4, 5, 6};
        int n = arr.length;
        mismatch.findErrorNums(arr);
    }
}
