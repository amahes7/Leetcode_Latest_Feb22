package OlderPackage.CodeByte.AlgorithmCourse;

public class MaxAreaOfIsland {
    static int maxSum = 0;

    public static void main(String[] args) {
        int[][] input = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        System.out.println(maxAreaOfIsland(input));
    }

    static boolean[][] seen;

    public static int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        seen = new boolean[grid.length][grid[0].length];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                ans = Math.max(ans, util(grid, r, c));
            }
        }
        return ans;
    }


    private static int util(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length
                || seen[r][c] || grid[r][c] == 0)
            return 0;
        seen[r][c] = true;
        return (1 + util(grid, r + 1, c) + util(grid, r - 1, c)
                + util(grid, r, c - 1) + util(grid, r, c + 1));
    }
}
