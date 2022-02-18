package Feb22Practise.LeetcodeDS1;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, result = 0;
        int[] arr = new int[128];
        while (right < s.length()) {
            char r = s.charAt(right);
            arr[r]++;

            while (arr[r] > 1) {
                char l = s.charAt(left);
                arr[l]--;
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}
