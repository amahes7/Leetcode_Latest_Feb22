package MustCodingQuestions.Google;

import java.util.Stack;

public class LongestValidParanthesisBruteForce {

    public static int longestValidParentheses(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j += 2) {
                if (isValid(s.substring(i, j))) {
                    result = Math.max(result, j - i);
                }
            }
        }
        return result;
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push('(');
            else if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        System.out.println(longestValidParentheses("(()"));
    }
}
