package Leetcode.AmazonEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseballGame {

    public static int calPoints(String[] ops) {
        List<Integer> record = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "+":
                    record.add(record.get(record.size() - 1) + record.get(record.size() - 2));
                    break;
                case "D":
                    int result2 = record.stream().skip(record.size() - 1).findFirst().orElse(0);
                    record.add(result2 * 2);
                    break;
                case "C":
                    record.remove(record.size() - 1);
                    break;
                default:
                    record.add((Integer.valueOf(ops[i])));
            }
        }
        int result = record.stream().reduce(0, (a, b) -> a + b);
        return result;

    }

    public static int calPointsStack(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int sum = top + stack.peek();
                stack.push(top);
                stack.push(sum);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                int temp = stack.peek() * 2;
                stack.push(temp);
            }else stack.push(Integer.valueOf(op));
        }
        return stack.stream().reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        String[] input = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPointsStack(input));
    }
}
