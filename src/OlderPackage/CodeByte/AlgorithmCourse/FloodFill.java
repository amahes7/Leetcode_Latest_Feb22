package OlderPackage.CodeByte.AlgorithmCourse;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int current = image[sr][sc];
        if (current != newColor) util(image, sr, sc, current, newColor);
        return image;
    }

    private void util(int[][] image, int r, int c, int current, int newColor) {
        if (image[r][c] == current){
            image[r][c] = newColor;
            if (r>=1) util(image,r-1,c,current,newColor);
            if (c>=1) util(image,r,c-1,current,newColor);
            if (r+1 < image.length) util(image,r+1,c,current,newColor);
            if (c+1 < image[0].length) util(image,r,c+1,current,newColor);
        }

    }
}
