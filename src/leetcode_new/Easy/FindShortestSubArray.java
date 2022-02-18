package leetcode_new.Easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> lIndex = new HashMap<>(), rIndex = new HashMap<>(), count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (!lIndex.containsKey(n)) lIndex.put(n, i);
            rIndex.put(n, i);
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (Map.Entry entry : count.entrySet()) {
            if ((int) entry.getValue() == degree) ans = Math.min(ans, rIndex.get(entry.getKey())- lIndex.get(entry.getKey())+1);
        }
        return ans;
    }
}
