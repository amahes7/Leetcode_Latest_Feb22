package OlderPackage.bloomberg;

import java.util.Stack;

public class CandyCrush {
// O(N)
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> occurance = new Stack<>();
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            if (stack.isEmpty() || c != stack.peek()) {
                if (!stack.isEmpty() && occurance.peek() >= 3) {
                    stack.pop();
                    occurance.pop();
                } else {
                    stack.push(c);
                    occurance.push(1);
                    i++;
                }
            } else {
                int count = occurance.pop();
                occurance.push(count + 1);
                i++;
            }
        }

        if (occurance.peek() >= 3) {
            stack.pop();
            occurance.pop();
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            char c = stack.pop();
            int count = occurance.pop();
            while (count > 0) {
                sb.append(c);
                count--;
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        CandyCrush solution = new CandyCrush();
        System.out.println(solution.solution("aaabcbbccc"));
//        System.out.println(solution.solution("aabbbacd"));
//        System.out.println(solution.solution("aabbccddeeedcba"));
//        System.out.println(solution.solution("aaabbbacd"));
    }



//    /O((rc)^2), because it costs 3rc to scan the whole board then we call at most rc/3 times
    public int[][] candyCrush(int[][] board) {
        int r = board.length, c = board[0].length;
        boolean crush = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // check horizontal line
                int v = Math.abs(board[i][j]);
                if (v == 0) continue;
                if (j + 2 < c && v == Math.abs(board[i][j + 1]) && v == Math.abs(board[i][j + 2])) {
                    crush = true;
                    board[i][j] = board[i][j + 1] = board[i][j + 2] = -v;
                }
                // check vertical line
                if (i + 2 < r && v == Math.abs(board[i + 1][j]) && v == Math.abs(board[i + 2][j])) {
                    crush = true;
                    board[i][j] = board[i + 1][j] = board[i + 2][j] = -v;
                }
            }
        }
        // crush candy
        for (int j = 0; j < c; j++) {
            int id = r - 1;
            for (int i = r - 1; i >= 0; i--) {
                if (board[i][j] > 0) {
                    board[id--][j] = board[i][j];
                }
            }
            while (id >= 0) board[id--][j] = 0;
        }
        return crush ? candyCrush(board) : board;
    }
}
