package DataStructureCourse;

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        System.out.println(canConstruct1("a", "b"));
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : magazine.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch : ransomNote.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == -1) return false;
            } else return false;
        }
        return true;
    }


    public static boolean canConstruct1(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;
        int[] count = new int[26];
        for (char ch : magazine.toCharArray()) count[ch - 'a']++;
        for (char ch : ransomNote.toCharArray()) {
            count[ch - 'a']--;
            if (count[ch - 'a'] == -1) return false;
        }
        return true;
    }
}
