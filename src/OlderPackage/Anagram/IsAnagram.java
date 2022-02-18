package OlderPackage.Anagram;

import java.util.HashMap;

// Leetcode 242
public class IsAnagram {

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if(map1.get(ch) == null || map1.get(ch) == 0)return false;
            else{
                map1.put(ch,map1.get(ch)-1);
            }
        }
        return true;
    }
}
