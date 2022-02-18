package leetcode_new.Medium;

import java.util.Collections;
import java.util.HashMap;

public class LongestSubstringwithAtMostKDistinctCharacters {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int left = 0, right = 0, result = 0, n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        if (n < k) return n;
        while (right < n) {
            map.put(s.charAt(right), right);
            if (map.size() == k) {
                int index = Collections.min(map.values());
                map.remove(s.charAt(index));
                left = index + 1;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }


    public static void main(String[] args) {
        LongestSubstringwithAtMostKDistinctCharacters a = new LongestSubstringwithAtMostKDistinctCharacters();
        System.out.println(a.lengthOfLongestSubstringKDistinct("eceba", 2));
    }

}
