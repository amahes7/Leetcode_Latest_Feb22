package leetcode_new.Easy;

import java.util.Stack;

public class ReverseStringII {

//    Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
//
//    If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
//
//
//
//    Example 1:
//
//    Input: s = "abcdefg", k = 2
//    Output: "bacdfeg"
//    Example 2:
//
//    Input: s = "abcd", k = 2
//    Output: "bacd"


    public static void main(String[] args) {
        System.out.println(Integer.compare(1, 1));
//        System.out.println(reverseStr("abcdefg", 3));
    }

    public static String reverseStr(String s, int k) {
        char[] array = s.toCharArray();
        for (int start = 0; start < s.length() - 1; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, s.length() - 1);
            while (i < j) {
                char temp = array[i];
                array[i++] = array[j];
                array[j--] = temp;
            }
        }
        return array.toString();
    }


    public static boolean checkValidString(String s) {
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftStack.push(i);
            } else if (s.charAt(i) == ')') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false;
                }
            } else {
                starStack.push(i);
            }
        }
        while (!leftStack.isEmpty() && !starStack.isEmpty()) {
            int li = leftStack.pop();
            int si = starStack.pop();
            if (si < li) {
                return false;
            }
        }
        if (!leftStack.isEmpty()) {
            return false;
        }
        return true;

//        if (starStack.size() < leftStack.size()) return false;
//        return true;
    }
}
