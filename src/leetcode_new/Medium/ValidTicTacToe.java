package leetcode_new.Medium;

public class ValidTicTacToe {


    public boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;
        for (String row : board) {
            for (char ch : row.toCharArray()) {
                if (ch == 'X') xCount++;
                else if (ch == 'O') oCount++;
            }
        }

        if (oCount != xCount && oCount != xCount - 1) return false;
        if (winPlayer(board, 'X') && oCount != xCount - 1) return false;
        if (winPlayer(board, 'O') && oCount != xCount) return false;
        return true;

    }

    private boolean winPlayer(String[] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (player == board[0].charAt(i) &&
                    player == board[1].charAt(i) &&
                    player == board[2].charAt(i)) return true;
            if (player == board[i].charAt(0) &&
                    player == board[i].charAt(1) &&
                    player == board[i].charAt(2)) return true;
            if (player == board[0].charAt(0) &&
                    player == board[1].charAt(1) &&
                    player == board[2].charAt(2)) return true;
            if (player == board[2].charAt(0) &&
                    player == board[1].charAt(1) &&
                    player == board[0].charAt(2)) return true;
        }
        return false;
    }
}
