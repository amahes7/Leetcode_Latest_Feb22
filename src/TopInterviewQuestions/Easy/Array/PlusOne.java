package TopInterviewQuestions.Easy.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] arr1 = new int[]{8, 9, 9, 9};
        plusOne(arr1);
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length, last = digits[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i - 1] = 0;
            }
        }
        int[] finalNumber = new int[n + 1];
        finalNumber[0] = 1;
        return finalNumber;
    }

}
