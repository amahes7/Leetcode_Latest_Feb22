package leetcode_new.Medium;

import java.util.ArrayList;
import java.util.List;

public class ReverseWord2 {

    public static void reverseWords(char[] s) {
//        Input: s = ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
//        Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i] != ' ') {
                word.append(s[i]);
            } else {
                result.append(word.reverse());
                result.append(" ");
                word = new StringBuilder();
            }
        }
        result.append(word.reverse());
        s = result.toString().toCharArray();
        System.out.println(s);
    }

    public static void main(String[] args) {
        char[] Input = {'t', 'h', 'e', ' ', 's', 'k', 'y'};
        reverseWordsOp(Input);
    }


    public static void reverseWordsOp(char[] s) {
        reverse(s, 0, s.length - 1);
        reverseWord(s);
        System.out.println(s.toString());
    }

    private static void reverseWord(char[] s) {
        int start = 0, end = 0;
        int n = s.length;
        while (start < n) {
            while (end < n && s[end] != ' ') end++;
            reverse(s, start, end - 1);
            end++;
            start = end;
        }
    }

    private static void reverse(char[] s, int l, int r) {
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

}
