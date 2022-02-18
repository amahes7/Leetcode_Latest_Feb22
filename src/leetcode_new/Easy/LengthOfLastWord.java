package leetcode_new.Easy;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
//        String[] str = s.trim().split(" ");
//        return str[str.length-1].length();

        s = s.trim();
        return s.substring(s.lastIndexOf(" ") + 1).length();


    }

}
