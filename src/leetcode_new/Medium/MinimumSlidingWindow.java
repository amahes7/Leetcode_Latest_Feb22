package leetcode_new.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumSlidingWindow {

    public static void main(String[] args) {
        System.out.println(minWindow("DOBECODEBBANC", "DBB"));
    }

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int minlen = Integer.MAX_VALUE;
        int l = 0, r = 0, charCount = 0, start = 0;
        Map<Character, Integer> tmap = new HashMap<>();
        for (char ch : t.toCharArray()) tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
        Map<Character, Integer> windowMap = new HashMap<>();
        while (r < s.length()) {
            char temp = s.charAt(r);
            windowMap.put(temp, windowMap.getOrDefault(temp, 0) + 1);
            if (tmap.containsKey(temp) && windowMap.get(temp) == tmap.get(temp)) charCount++;
            while (l <= r && charCount == tmap.size()) {
                if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    start = l;
                }
                char ch = s.charAt(l);
                windowMap.put(ch, windowMap.get(ch) - 1);
                if (tmap.containsKey(ch) && windowMap.get(ch) < tmap.get(ch)) charCount--;
                l++;
            }
            r++;
        }
        return (minlen > s.length()) ? "" : s.substring(start, start + minlen);
    }
}

