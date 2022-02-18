package Feb22Practise.LeetcodeDS1;

public class ReshapetheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n= mat[0].length;
        int[][] result = new int[r][c];
        int row=0,col=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                result[row][col] = mat[i][j];
                col++;
                if (col ==c){
                    row++;
                    col=0;
                }
            }
        }
        return result;
    }
}
