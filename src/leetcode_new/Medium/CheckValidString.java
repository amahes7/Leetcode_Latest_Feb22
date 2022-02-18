package leetcode_new.Medium;

import java.util.Stack;

public class CheckValidString {

    public static void main(String[] args) {
        System.out.println(checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
    }

    public static boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) stack.pop();
                else if (!starStack.isEmpty()) starStack.pop();
                else return false;
            } else starStack.push(i);
        }
        while (!stack.isEmpty() && !starStack.isEmpty()){
            if(starStack.pop() < stack.pop()) return false;
        }
        if(!stack.isEmpty()) return false;
        return true;
    }


//    public static boolean checkValidString1(String s) {
//        Stack<Integer> leftStack = new Stack<>();
//        Stack<Integer> starStack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                leftStack.push(i);
//            }
//            else if (s.charAt(i) == ')') {
//                if (!leftStack.isEmpty()) {
//                    leftStack.pop();
//                }
//                else if (!starStack.isEmpty()) {
//                    starStack.pop();
//                }
//                else {
//                    return false;
//                }
//            }
//            else {
//                starStack.push(i);
//            }
//        }
//        while (!leftStack.isEmpty() && !starStack.isEmpty()) {
//            int li = leftStack.pop();
//            int si = starStack.pop();
//            if (si < li) {
//                return false;
//            }
//        }
//        if (!leftStack.isEmpty()) {
//            return false;
//        }
//        return true;
//
////        if (starStack.size() < leftStack.size()) return false;
////        return true;
//    }

}
