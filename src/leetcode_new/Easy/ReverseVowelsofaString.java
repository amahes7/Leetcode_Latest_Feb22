package leetcode_new.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsofaString {

    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r) {
            if (vowels.contains(chars[l]) && vowels.contains(chars[r])) {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            } else if (!vowels.contains(chars[l]) && !vowels.contains(chars[r])) {
                l++;
                r--;
            } else if (!vowels.contains(chars[l]) && vowels.contains(chars[r])) l++;
            else if (vowels.contains(chars[l]) && !vowels.contains(chars[r])) r--;
        }
        return String.valueOf(chars);

    }
}
