package leetcode_new.Easy;

import java.util.Arrays;
import java.util.Collections;

public class MaximumPopulationYear {

    public static int maximumPopulation(int[][] logs) {
        Integer[] map = new Integer[101];
        Arrays.fill(map, 0);
        for (int[] l : logs) {
            for (int i = l[0]; i < l[1]; i++) {
                map[i - 1950]++;
            }
        }
        return Collections.max(Arrays.asList(map));
    }


    public static void main(String[] args) {
        int[][] input = new int[][]{{1993, 1999}, {2000, 2010}};
        System.out.println(maximumPopulation(input));
    }
}
