package leetcode_new.Easy;

import java.util.Stack;

public class ValidParanthesis {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch =='(') stack.push(ch);
            else if (ch =='{') stack.push(ch);
            else if (ch =='[') stack.push(ch);
            else if (ch == ')' && !stack.isEmpty()&& stack.peek().equals('(')) stack.pop();
            else if (ch == ']' && !stack.isEmpty()&& stack.peek().equals('[')) stack.pop();
            else if (ch == '}' && !stack.isEmpty()&& stack.peek().equals('{')) stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(a)"));
    }

}