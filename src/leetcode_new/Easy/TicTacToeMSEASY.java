package leetcode_new.Easy;

public class TicTacToeMSEASY {


    int[][] board;

    public String tictactoe(int[][] moves) {
        int n = 3;
        board = new int[n][n];
        int player = 1;

        for (int[] move : moves) {
            int row = move[0];
            int col = move[1];

            board[row][col] = player;
            if (winPlayer(board, player)) return player == 1 ? "A" : "B";
            else player *= -1;
        }
        return moves.length == n * n ? "Draw" : "Pending";
    }


    private boolean winPlayer(int[][] board, int player) {
        for (int i = 0; i < 3; i++) {
            if (player == board[0][i] &&
                    player == board[1][i] &&
                    player == board[2][i]) return true;
            if (player == board[i][0] &&
                    player == board[i][1] &&
                    player == board[i][2]) return true;
            if (player == board[0][0] &&
                    player == board[1][1] &&
                    player == board[2][2]) return true;
            if (player == board[2][0] &&
                    player == board[1][1] &&
                    player == board[0][2]) return true;
        }
        return false;
    }
}
