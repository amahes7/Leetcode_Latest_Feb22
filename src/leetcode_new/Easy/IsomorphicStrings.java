package leetcode_new.Easy;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "bod"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        else {
            return helper(s).equals(helper(t));

        }
    }

    private static String helper(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i), i);
            sb.append(map.get(s.charAt(i)));
            sb.append("_");
        }
        return sb.toString();
    }

}
