package leetcode_new.Easy;

public class Convert1DArrayInto2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if (m*n != original.length) return result;
        else{
            int index=0,row=0,col=0;
            while (index<original.length){
                result[row][col] = original[index];
                index++;
                col++;
                if (col == n){
                    row++;
                    col=0;
                }
            }
        }
        return result;
    }
}
