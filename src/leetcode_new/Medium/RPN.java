package leetcode_new.Medium;

import java.util.Arrays;
import java.util.Stack;

public class RPN {

    public static void main(String[] args) {
        String[] input = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(input));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int x = 0, y = 0;
        for (String num : tokens) {
            if (num.equals("+") || num.equals("-") || num.equals("*") || num.equals("/")) {
                x = stack.pop();
                y = stack.pop();
            }
            switch (num) {
                case "+":
                    stack.push(x + y);
                    break;
                case "-":
                    stack.push(y - x);
                    break;
                case "*":
                    stack.push(x * y);
                    break;
                case "/":
                    stack.push(y / x);
                    break;
                default:
                    stack.push(Integer.valueOf(num));
            }
        }
        return stack.pop();
    }
}
