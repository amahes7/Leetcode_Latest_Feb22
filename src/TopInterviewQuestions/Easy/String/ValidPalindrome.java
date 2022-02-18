package TopInterviewQuestions.Easy.String;

import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int N = str.length();
        for(int i=0;i<N/2;i++){
            if(str.charAt(i) != str.charAt(N-1-i)) return false;
        }
        return true;
    }
}
