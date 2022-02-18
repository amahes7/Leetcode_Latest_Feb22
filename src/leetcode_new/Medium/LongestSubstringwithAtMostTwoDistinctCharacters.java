package leetcode_new.Medium;

import java.util.Collections;
import java.util.HashMap;

public class LongestSubstringwithAtMostTwoDistinctCharacters {


    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int left = 0, right = 0, n = s.length(), result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < n) {
            map.put(s.charAt(right), right);
            if (map.size() == 3) {
                int index = Collections.min(map.values());
                map.remove(s.charAt(index));
                left = index + 1;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}
