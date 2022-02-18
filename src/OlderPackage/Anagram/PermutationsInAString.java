package OlderPackage.Anagram;

public class PermutationsInAString {
    public static void main(String[] args) {
        String s = "abc", t = "eidbaooo";
        System.out.println(checkInclusion(s, t));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        if (s2Len < s1Len) return false;
        for (int i = 0; i <= s2Len - s1Len; i++) {
            if (isAnagram(s2.substring(i, i + s1Len), s1)) return true;
        }
        return false;
    }

    private static boolean isAnagram(String substring, String s1) {
        int[] count = new int[26];
        for (int i = 0; i < substring.length(); i++) count[substring.charAt(i) - 'a']++;
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']--;
            if (count[s1.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }
}
