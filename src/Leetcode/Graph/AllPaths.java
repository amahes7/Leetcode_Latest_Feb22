package Leetcode.Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllPaths {

    public static List<Set<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Set<Integer>> result = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            Set<Integer> list = new HashSet<>();
            list.add(i);
            for (int j = 0; j < graph[i].length; j++) {
                list.add(graph[i][j]);
                int[] a = graph[graph[i][j]];
                for (int k = 0; k < a.length; k++) {
                    list.add(a[k]);
                }
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        allPathsSourceTarget(input);
    }
}
