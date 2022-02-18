package leetcode_new.Medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int slen = s.length(), plen = p.length();
        if (slen < plen) return result;
        for (int i = 0; i < slen - plen; i++) {
            String subString = s.substring(i, i + plen);
            if (isAnagram(subString, p)) result.add(i);
        }
        return result;

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;

            if (count[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
