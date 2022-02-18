package OlderPackage.CodeByte.AlgorithmCourse;

public class targetSearch {


    public static void main(String[] args) {
        int[] input = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(input, 2));
    }

    public static int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    private static int helper(int[] nums, int target, int start, int end) {
        int mid = start + (end-start) / 2;
        if(start>end) return -1;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return helper(nums, target, start, mid - 1);
        else if (nums[mid] < target) return helper(nums, target, mid + 1, end);
        return -1;
    }
}
