package leetcode_new.Medium;

import java.util.Stack;

public class MinRemoveToMakeValidParanthesis {

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("()())("));
    }
// )

    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '(') stack.push(i);
            else if (chars[i] == ')') {
                if (stack.isEmpty()) {
                    chars[i] = '.';
                } else {
                    stack.pop();
                }
            }
        }
       while(!stack.isEmpty()){
           chars[stack.pop()] ='.';
       }
       StringBuilder sb = new StringBuilder();
       int count =0;
       for(char ch: chars){
           if(ch != '.') sb.append(ch);
           else count ++;
       }
        System.out.println(count);
       return sb.toString();
    }
}
