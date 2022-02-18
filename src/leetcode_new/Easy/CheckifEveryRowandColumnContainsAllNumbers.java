package leetcode_new.Easy;

import java.util.HashSet;

public class CheckifEveryRowandColumnContainsAllNumbers {


    public boolean checkValid(int[][] matrix) {
        int m = matrix.length;
        HashSet<Integer> rowset = new HashSet<>();
        HashSet<Integer> colset = new HashSet<>();
        int temp = 0;
        while (temp < m) {
            for (int i = 0; i < m; i++) {
                if (!rowset.add(matrix[temp][i])) return false;
                else if (!colset.add(matrix[i][temp])) return false;
            }
            rowset = new HashSet<>();
            colset = new HashSet<>();
            temp++;
        }
        return true;
    }
}



