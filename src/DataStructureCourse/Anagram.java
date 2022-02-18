package DataStructureCourse;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "naagram"));
    }


    public static boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) return false;
        int[] count = new int[26];
        for (char ch : s.toCharArray()) count[ch - 'a']++;
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
            if (count[ch - 'a'] == -1) return false;
        }
        return true;
    }
}
