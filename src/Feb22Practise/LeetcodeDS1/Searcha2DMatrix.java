package Feb22Practise.LeetcodeDS1;

public class Searcha2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = 0;
        while (row < m) {
            if (matrix[row][col] <= target && matrix[row][n-1] >= target) {
                for (int i = 0; i < n; i++) {
                    if (matrix[row][i] == target) return true;
                }
                return false;
            } else row++;
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] input = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        Searcha2DMatrix searchMatrix = new Searcha2DMatrix();
        System.out.println(searchMatrix.searchMatrix(input, 3));
    }
}
