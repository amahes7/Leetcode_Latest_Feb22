package Online;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForbiddenString {


    public static void main(String[] args) {
        List<String> forbiddenWords = new ArrayList<>();
        forbiddenWords.add("foo");
        forbiddenWords.add("ate");
        System.out.println(lengthOfLongestSubstring("asdfoo123ate", forbiddenWords));
    }

    private static int lengthOfLongestSubstring(String s, List<String> forbiddenWords) {
        int ans = 0;
        int n = s.length();
        int left = 0, right = 1;
        while (left < n && right < n) {
            for (String word : forbiddenWords) {
                if (!s.substring(left, right).contains(word)) {
                    ans = Math.max(ans, s.substring(left, right).length());
                    right++;
                } else {
                    left++;
                }
            }
        }
        return ans;
    }

}
