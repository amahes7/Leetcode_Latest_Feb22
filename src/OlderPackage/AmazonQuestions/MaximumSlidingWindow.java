package OlderPackage.AmazonQuestions;

public class MaximumSlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int num = (nums.length) - k + 1;
        int[] result = new int[num];
        for (int i = 0; i < (num); i++) {
            int max = nums[i];
            for (int j = i + 1; j < i+k; j++) {
                if (max < nums[j]) max = nums[j];
            }
            result[i] = max;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] result = maxSlidingWindow(input, 3);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
