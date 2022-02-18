package OlderPackage.AmazonQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ThreeSum {


    public static void main(String[] args) {
        int[] input = new int[]{-6, -9, -7, -5 - 1, 0, 1, 2, 3, 4, 6, 5, 7, 9};
        threeSum(input);
    }

    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        TreeSet<String> t = new TreeSet<>();

        Arrays.sort(arr);
        int l, r;
        for (int i = 0; i < arr.length - 2; i++) {
            l = i + 1;
            r = arr.length - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0) {
                    String str = arr[i] + "+" + arr[l] + "+" + arr[r];
                    if (!t.contains(str)) {
                        row.add(arr[i]);
                        row.add(arr[l]);
                        row.add(arr[r]);
                        result.add(row);
                        row = new ArrayList<>();
                        t.add(str);
                    }
                    l++;
                    r--;
                } else if (sum > 0) r--;
                else if (sum < 0) l++;
            }
        }
        return result;
    }
}
