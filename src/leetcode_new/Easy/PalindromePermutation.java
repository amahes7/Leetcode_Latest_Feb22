package leetcode_new.Easy;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        int count = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (((int) entry.getValue() % 2) != 0) count++;
            if (count>1) return false;
        }
        return true;
    }
}
