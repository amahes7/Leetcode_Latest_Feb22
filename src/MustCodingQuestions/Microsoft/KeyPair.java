package MustCodingQuestions.Microsoft;

import java.util.Arrays;

public class KeyPair {

    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        int start = 0, end = n - 1;
        Arrays.sort(arr);
        while (start < end) {
            if (arr[start] + arr[end] == x) return true;
            else if (arr[start] + arr[end] > x)
                end--;
            else if (arr[start] + arr[end] < x) {
                start++;
            }
        }
        return false;
    }
}
