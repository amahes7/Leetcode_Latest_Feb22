package OlderPackage.bloomberg;

import java.util.HashSet;
import java.util.LinkedList;

public class KnighMoves {

    int[][] dirs = new int[][]{{-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {-2, -1}, {-2, 1}, {2, -1}, {2, 1}};

    public int minKnightMoves(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);

        HashSet<String> visited = new HashSet<>();
        LinkedList<int[]> que = new LinkedList<>();
        que.add(new int[]{0, 0});
        visited.add("0,0");

        int step = 0;
        while (!que.isEmpty()) {
            int size = que.size();
            while (size-- > 0) {
                int[] cur = que.poll();
                if (cur[0] == x && cur[1] == y) {
                    return step;
                }

                for (int[] dir : dirs) {
                    int i = cur[0] + dir[0];
                    int j = cur[1] + dir[1];
                    if (!visited.contains(i + "," + j) && i >= -1 && j >= -1) {
                        que.add(new int[]{i, j});
                        visited.add(i + "," + j);
                    }
                }
            }

            step++;
        }

        return -1;
    }
}
