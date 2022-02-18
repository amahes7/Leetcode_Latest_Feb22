package TopInterviewQuestions.Easy.Array;

import java.util.HashSet;
import java.util.Set;

public class ValidSoduko {

    public static void main(String[] args) {
        char[][] input = new char[][]{{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                                    , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                                    , {'.', '9', '.', '.', '.', '.', '.', '6', '.'}
                                    , {'.', '.', '.', '.', '6', '.', '.', '.', '3'}
                                    , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                                    , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                                    , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                                    , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                                    , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isvalidsudoku1(input));
//        System.out.println(input[0][2]);
    }

    public static boolean isvalidsudoku1(char[][] board) {
        HashSet seen = new HashSet();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i / 3 + "-" + j / 3))
                        return false;
            }
        }
        return true;
    }


    public static boolean isvalidsudoku(char[][] board) {
        if (checkRows(board) && checkColumn(board) && checkMatrix(board)) return true;
        else return false;

    }

    private static boolean checkMatrix(char[][] board) {
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 7; col++) {
//                validate(board,row,col);
            }

        }
        return true;
    }


    private static boolean checkColumn(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                HashSet<Character> set = new HashSet<>();
                char ch = board[j][i];
                if (ch != '.' && !set.add(ch)) {
                    return false;
                }
            }

        }
        return true;
    }

    private static boolean checkRows(char[][] board) {
        for (char[] row : board) {
            HashSet<Character> set = new HashSet<>();
            for (char ch : row) {
                if (ch != '.' && !set.add(ch)) {
                    return false;
                }
            }
        }
        return true;
    }
}
