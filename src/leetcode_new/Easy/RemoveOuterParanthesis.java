package leetcode_new.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveOuterParanthesis {


    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        List<Integer> index = new ArrayList<>();
        stack.push(s.charAt(0));
        String res = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (!stack.isEmpty()) {
                    stack.push('(');
                    res += s.charAt(i);
                } else stack.push('(');
            } else if (s.charAt(i) == ')' && !stack.isEmpty()) {
                stack.pop();
                if (!stack.isEmpty()) res += s.charAt(i);
            }
        }
        return res;
    }


    public String removeOuterParentheses1(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        String res = "";
        char[] arr= s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (arr[i] == '(') {
                if (!stack.isEmpty()) {
                    stack.push('(');
                    res += arr[i];
                } else stack.push('(');
            } else if (arr[i] == ')' && !stack.isEmpty()) {
                stack.pop();
                if (!stack.isEmpty()) res += arr[i];
            }
        }
        return res;
    }

}
