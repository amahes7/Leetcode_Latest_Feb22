package DataStructureCourse;

import java.util.HashSet;

public class IsValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (!set.add(ch + " seen at row: " + i) ||
                            !set.add(ch + " seen at col: " + j) ||
                            !set.add(ch + " seen at grid: " + i / 3 + " " + j / 3)) {
                        return false;

                    }
                }

            }
        }
        return true;
    }
}
