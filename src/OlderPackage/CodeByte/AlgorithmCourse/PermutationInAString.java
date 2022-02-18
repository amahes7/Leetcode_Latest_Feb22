package OlderPackage.CodeByte.AlgorithmCourse;

public class PermutationInAString {

    public boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length(), s2Len = s2.length();
        if (s1Len > s2Len) return false;
        for (int i = 0; i <= s2Len - s1Len; i++) {
            if (checkInclusionHelper(s2.substring(i, i + s1Len), s1)) return true;
        }
        return false;

    }

    private boolean checkInclusionHelper(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
            if (count[t.charAt(i) - 'a'] == -1) return false;
        }
        return true;
    }
}
