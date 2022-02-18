package OlderPackage.Anagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//leetcode 438
public class FIndAllAnagrams {
    public static void main(String[] args) {
        String s = "abab", t = "ab";
        System.out.println(findAnagrams(s, t));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int slen = s.length();
        int plen = p.length();
        if (slen < plen) return result;
        for (int i = 0; i <= slen - plen; i++) {
            String sub = s.substring(i, i + plen);
            if (isAnagramOp(sub, p)) result.add(i);
        }
        return result;
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (map.get(ch) == null || map.get(ch) == 0) return false;
            else {
                map.put(ch, map.get(ch) - 1);
            }
        }
        return true;
    }


    public static boolean isAnagramOp(String s, String t) {
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
