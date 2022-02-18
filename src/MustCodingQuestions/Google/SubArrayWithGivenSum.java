package MustCodingQuestions.Google;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (sum + arr[j] <= target) {
                    sum += arr[j];
                }else if (sum + arr[j] >target) break;
                if (sum == target) {
                    result.add(i + 1);
                    result.add(j + 1);
                    break;
                }
            }
            if (!result.isEmpty()) return result;
        }
        if (result.isEmpty()) result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] array = new int[]{135,101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        result = subarraySum(array, 42, 468);
        result.stream().forEach(System.out::println);
    }
}
