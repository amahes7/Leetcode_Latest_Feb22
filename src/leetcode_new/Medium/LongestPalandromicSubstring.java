package leetcode_new.Medium;

public class LongestPalandromicSubstring {

    static String longestPalSubstr(String s) {
        int maxlen = 1, start = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean flag = false;
                for (int k = 0; k < (j - i + 1) / 2; k++) {
                    if (s.charAt(i + k) != s.charAt(j - k)) flag = true;
                }
                if (!flag && j - i + 1 > maxlen) {
                    maxlen = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + maxlen);
    }

    static String longestPalSubstrop(String s) {
        int start = 0, maxlen = 1, n = s.length();
        boolean[][] table = new boolean[n][n];
        // length of palindrome 1
        for (int i = 0; i < n; i++) table[i][i] = true;
        // length of palindrome 2
//        for (int i = 0; i < n - 1; i++) {
//            if (s.charAt(i) == s.charAt(i + 1)) {
//                table[i][i + 1] = true;
//                start = i;
//                maxlen = 2;
//            }
//        }

        for (int k = 2; k < s.length(); k++) {
            for (int l = 0; l < n - k + 1; l++) {
                int r = l + k - 1;
                if (s.charAt(l) == s.charAt(r)) {
                    table[l][r] = true;
                    if (k > maxlen) {
                        start = l;
                        maxlen = k;
                    }
                }
            }
        }
        return s.substring(start, start + maxlen);
    }

    static int begin = 0;
    static int maxLen = 1;

    public static String longestpal(String s) {
        for (int i = 0; i < s.length(); i++) {
            // Odd Length
            helper(s, i, i);
            // even length
            helper(s, i, i + 1);
        }
        return s.substring(begin, begin + maxLen);
    }

    private static void helper(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end) ) {
            start--;
            end++;
        }
        if (maxLen < end - start - 1) {
            begin = start + 1;
            maxLen = end - start - 1;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        String str = "cbbd";
        System.out.print("\nLength is: "
                + longestpal(str));
    }
}
