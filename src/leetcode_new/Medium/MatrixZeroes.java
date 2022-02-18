package leetcode_new.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MatrixZeroes {

    public void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
            for (int r:rowSet){
                Arrays.fill(matrix[r],0);
            }
            for (int c:colSet){
                for (int iu=0;i<row;i++) matrix[i][c] =0;
            }
        }
    }
}
