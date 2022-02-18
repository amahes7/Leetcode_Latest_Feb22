package OlderPackage.CodeByte.AlgorithmCourse;

public class SearchInsert {


    public static void main(String[] args) {
        int[] input = {1, 3, 5, 6};
        System.out.println(searchInsert(input, 2));
    }


    public static int searchInsert(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    private static int helper(int[] nums, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) return helper(nums, target, start, mid - 1);
            else if (nums[mid] < target) return helper(nums, target, mid + 1, end);
        }
        return start ;
    }
}
