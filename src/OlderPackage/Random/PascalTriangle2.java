package OlderPackage.Random;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {
        System.out.println(generate(3));
    }

    public static List<Integer> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();

        for (int i = 1; i <= numRows+1; i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) curr.add(1);
                else curr.add(prev.get(j - 1) + prev.get(j - 2));
            }
            result.add(curr);
            prev = curr;
        }
        return result.get(numRows);

    }
}
