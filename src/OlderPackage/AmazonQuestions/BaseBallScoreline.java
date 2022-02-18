package OlderPackage.AmazonQuestions;

import java.util.Stack;

public class BaseBallScoreline {
    static int getScore(String[] blocks) {
        Stack<Integer> total = new Stack<>();
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].equalsIgnoreCase("x")) {
                total.add(total.peek() * 2);
            } else if (blocks[i].equalsIgnoreCase("z")) {
                total.pop();
            } else if (blocks[i].equalsIgnoreCase("+")) {
                int top = total.pop();
                int newTop = top + total.peek();
                total.push(top);
                total.push(newTop);
            } else {
                total.add((Integer.parseInt(blocks[i])));
            }
        }
        int result = 0;
        for (int s : total) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] blocks = {"10", "20", "Z", "30", "+" };

        System.out.println(getScore(blocks));
    }
}
