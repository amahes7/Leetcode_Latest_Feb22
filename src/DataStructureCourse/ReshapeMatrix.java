package DataStructureCourse;

public class ReshapeMatrix {

    public static void main(String[] args) {
        int[][] input = {{1, 2}, {3, 4}};
        matrixReshape(input, 1, 4);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length * mat.length;
        int m = r * c;
        if (n != m) return mat;
        else {
            int row = 0, col = 0;
            int[][] result = new int[r][c];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                        result[row][col] = mat[i][j];
                        col++;
                        if(col == c) {
                            row++;
                            col = 0;
                        }
                    }
                }
            return result;

        }
    }
}
