package TopInterviewQuestions.Easy.String;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] p = new char[]{'h', 'e', 'l', '0', '0'};
        String[] input = new String[]{"my", "Name", "is", "abhijeet"};
//        reverseString(p);
//        System.out.println(p.toString());
        String[] output = revString(input);
        for (int i = 0; i < output.length; i++)
            System.out.println(output[i]);
    }

    public static void reverseString(char[] s) {
        int N = s.length;
        for (int i = 0; i < N / 2; i++) {
            char temp = s[i];
            s[i] = s[N - i - 1];
            s[N - i - 1] = temp;
        }


    }

    public static String[] revString(String[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            String temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;
    }


}
