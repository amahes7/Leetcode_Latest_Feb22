package leetcode_new.Easy;

import java.util.Arrays;

public class ValidPalindrome2 {

    public static void main(String[] args) {
        ValidPalindrome2 obj = new ValidPalindrome2();
        obj.validPalindrome("abcba");
    }

    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            l++;
            r--;
        }
        if (l >= r) return true;
        else if (helper(s, l + 1, r) || helper(s, l, r - 1)) return true;
        return false;

    }

    private boolean helper(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else return false;
        }
        return true;
    }
}

