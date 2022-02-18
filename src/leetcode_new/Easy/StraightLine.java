package leetcode_new.Easy;

public class StraightLine {

    //    Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
//    Output: true
    public static boolean checkStraightLine(int[][] coordinates) {
        int num = coordinates.length;
        for (int i = 0; i < num - 1; i++) {
            int x1 = coordinates[i][0];
            int y1 = coordinates[i][1];
            int x2 = coordinates[i + 1][0];
            int y2 = coordinates[i + 1][1];
            if ((x2 - x1) != 1 && (y2 - y1) != 1) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        int[][] input = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        System.out.println(checkStraightLine(input));
    }
}
