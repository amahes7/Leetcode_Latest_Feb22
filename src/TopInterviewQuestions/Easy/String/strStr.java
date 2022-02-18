package TopInterviewQuestions.Easy.String;

public class strStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty() || needle.length() < 1) return 0;
        if (haystack.isEmpty() || haystack.length() < 1) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            for (j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
            if (j == needle.length()) return i;
        }
        return -1;
    }
}
