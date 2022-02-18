package DataStructureCourse;

public class SearchMatrix {

    public static void main(String[] args) {
        int[][] input1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] input2 = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
//        System.out.println(searchMatrixI(input1, 1));
        System.out.println(searchMatrixII(input2, 5));
    }

    public static boolean searchMatrixI(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int c = 0, r = 0;
        if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) return false;
        while (c < m && r < n) {
            if (matrix[c][r] == target) return true;
            else if (matrix[c][n - 1] >= target) {
                while (r < n) {
                    if (matrix[c][r] == target) return true;
                    else r++;
                }
                return false;
            } else if (matrix[c][n - 1] < target) c++;
        }
        return false;
    }


//    Write an efficient algorithm that searches for a target value in an m x n integer matrix. The matrix has the following properties:
//
//    Integers in each row are sorted in ascending from left to right.
//    Integers in each column are sorted in ascending from top to bottom.


    public static boolean searchMatrixII(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = 0;
        if (matrix[0][0] > target || matrix[m - 1][n - 1] < target) return false;
        while (row < n && col < m) {
            if (matrix[col][row] <= target && matrix[col][n - 1] >= target) {
                while (row < n) {
                    if (matrix[col][row] == target) return true;
                    else if (matrix[col][row] < target) row++;
                    else {
                        row = col;
                        break;
                    }
                }
            }
            if (matrix[col][row] <= target && matrix[m - 1][row] >= target) {
                while (col < m) {
                    if (matrix[col][row] == target) return true;
                    else if (matrix[col][row] < target) col++;
                    else {
                        col = row;
                        break;
                    }
                }
            }
            row++;
            col++;
        }
        return false;
    }
}
