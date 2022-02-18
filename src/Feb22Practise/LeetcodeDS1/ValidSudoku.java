package Feb22Practise.LeetcodeDS1;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> nums = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (!nums.add(ch + "row:" + i) ||
                            !nums.add(ch + "col:" + j) ||
                            !nums.add(ch + "row:" + i / 3 + "col:" + j / 3)) return false;
                }
            }
        }
        return true;
    }
}
