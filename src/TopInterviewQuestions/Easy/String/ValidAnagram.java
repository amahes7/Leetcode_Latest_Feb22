package TopInterviewQuestions.Easy.String;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        if (s.length() != t.length()) return false;
        else {
            for (int i = 0; i < s.length(); i++) {
                sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
                tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
            }
            for (int i = 0; i < s.length(); i++) {
                if (sMap.get(s.charAt(i)) != tMap.get(s.charAt(i))) return false;
            }
        }
        return true;
    }
}
