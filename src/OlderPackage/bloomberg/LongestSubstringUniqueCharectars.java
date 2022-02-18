package OlderPackage.bloomberg;

public class LongestSubstringUniqueCharectars {

    // O(n^2)
    public static int longestUniqueSubsttr1(String str) {
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[26];

            for (int j = i; j < n; j++) {
                if (visited[str.charAt(j)] == true) break;
                else {
                    res = Math.max(res, j - 1 + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }
        return res;
    }


    public static int longestUniqueSubsttr(String str) {
        String test = "";

        // Result
        int maxLength = -1;

        // Return zero if string is empty
        if (str.isEmpty()) {
            return 0;
        }
        // Return one if string length is one
        else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);

            // If string already contains the character
            // Then substring after repeating character
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                        + 1);
            }
            test = test + current;
            maxLength = Math.max(test.length(), maxLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubsttr1(str);
        System.out.println("The length of the longest non-repeating character substring is " + len);
    }
}
