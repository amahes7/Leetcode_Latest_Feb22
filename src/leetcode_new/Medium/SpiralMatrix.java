package leetcode_new.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {


    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = cols - 1, up = 0, down = rows - 1;
        while (result.size() < (rows * cols)) {
            for (int i = left; i <= right; i++)
                result.add(matrix[up][i]);
            for (int i = up + 1; i <= down; i++)
                result.add(matrix[i][right]);
            if (up != down)
                for (int i = right - 1; i >= left; i--)
                    result.add(matrix[down][i]);
            if (left != right)
                for (int i = down - 1; i > up; i--)
                    result.add(matrix[i][left]);
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        spiralOrder(input).stream().forEach(System.out::println);
    }

}
