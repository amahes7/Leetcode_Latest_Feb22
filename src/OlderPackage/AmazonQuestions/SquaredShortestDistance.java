package OlderPackage.AmazonQuestions;

public class SquaredShortestDistance {
    public static int shortestDistace(int n, int[] xPos, int[] yPos) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                int d = distance(xPos[j], yPos[j], xPos[i], yPos[i]);
                if (d < min && d != 0) {
                    min = d;
                }
            }
        }
        return min;
    }

    private static int distance(int x, int y, int x1, int y1) {
        return (int)(Math.pow((x - x1), 2) + Math.pow((y - y1), 2));
    }

    public static void main(String[] args) {
        int[] xCoordinates = {0,2,0};
        int[] yCoordinates = {0,3,0};
        int n = 3;
        System.out.println(shortestDistace(n, xCoordinates, yCoordinates));
//        System.out.println((int)Math.pow(3,2));
    }
}
