package leetcode_new.Easy;

import java.util.Stack;

class MaxStack {
    Stack<Integer> stack = new Stack<>();
    Stack<int[]> maxstack = new Stack<>();

    public MaxStack() {

    }

    public void push(int x) {
        if (maxstack.isEmpty() || x > maxstack.peek()[0]) maxstack.push(new int[]{x, 1});
        else if (x == maxstack.peek()[0]) maxstack.peek()[1]++;
        stack.push(x);
    }

    public int pop() {
        if (stack.peek() == maxstack.peek()[0]) maxstack.peek()[1]--;
        if (maxstack.peek()[1] == 0) maxstack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxstack.peek()[0];
    }

    public int popMax() {
        int max = peekMax();
        Stack<Integer> buffer = new Stack();
        while (top() != max) buffer.push(pop());
        pop();
        while (!buffer.isEmpty()) push(buffer.pop());
        return max;
    }
}

class Soution {
    public static void main(String[] args) {
        MaxStack obj = new MaxStack();
        obj.push(5);
        obj.push(1);
//        obj.push(5);
//        int param_1 = obj.top();
        int param_2 = obj.popMax();
//        int param_3 = obj.top();
        int param_4 = obj.peekMax();
//        int param_5 = obj.pop();
//        int param_6 = obj.top();
        int i=7;
    }
}

