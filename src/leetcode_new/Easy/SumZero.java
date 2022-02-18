package leetcode_new.Easy;

import java.util.Arrays;

public class SumZero {


    public static void main(String[] args) {
        Arrays.stream(sumZero(4)).forEach(System.out::println);
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int count = 0;
        int mid = n / 2;
        for (int i = 0; i < mid; i++) {
            result[i] = --count;
        }
        if (n % 2 == 0) {
            result[mid] = count = 1;
        } else {
            result[mid] = count = 0;
        }

        for (int i = mid + 1; i < n; i++) {
            result[i] = ++count;
        }
        return result;
    }
}
