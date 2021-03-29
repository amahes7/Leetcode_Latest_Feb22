package Here;

public class SubArrayWitrhGivenSum {

    public static void main(String[] args) {
        SubArrayWitrhGivenSum arraysum = new SubArrayWitrhGivenSum();
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 100;
        arraysum.subArraySum(arr, n, sum);
    }

    private int subArraySum(int[] arr, int n, int sum) {
        int curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum = arr[i];
            for (int j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    System.out.println("Sum between" + i + "and" + j);
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }
        System.out.println("Not Found");
        return 0;
    }
}
