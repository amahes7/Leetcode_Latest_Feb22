package Feb22Practise.LeetcodeAlgo;

import java.util.Arrays;

public class ReverseAString {

    public char[] reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
        return s;
    }


    public static void main(String[] args) {
        ReverseAString ReverseAString = new ReverseAString();
        char[] input = new char[]{'A','B','H','I'};
        System.out.println(ReverseAString.reverseString(input).toString());
    }
}
