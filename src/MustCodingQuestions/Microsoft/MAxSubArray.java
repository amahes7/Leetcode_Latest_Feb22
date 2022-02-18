package MustCodingQuestions.Microsoft;

public class MAxSubArray {


    long maxSubarraySum(int arr[], int n) {
        int max = arr[0];
        int currentMax = arr[0];
        for (int i = 1; i < n; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            max = Math.max(currentMax, max);
        }
        return max;
    }
}
