package DataStructureCourse;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharectar {

    public static void main(String[] args) {
        System.out.println(firstUniqChar1("leetcode"));
    }


    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (int i = 0; i < s.length(); i++) if (map.get(i) == 1) return i;
        return -1;
    }

    public static int firstUniqChar1(String s) {
        int ans = Integer.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {
            int left = s.indexOf(c);
            if (left != -1 && left == s.lastIndexOf(c)) {
                ans = Math.min(left, ans);
            }

        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

}
