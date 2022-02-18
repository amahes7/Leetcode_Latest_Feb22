package Feb22Practise.LeetcodeAlgo;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    private int helper(int[] nums, int target, int start, int end) {
        int mid = (end - start) / 2;
        while (start <= end) {
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) return helper(nums, target, start, mid - 1);
            else if (nums[mid] < target) return helper(nums, target, mid + 1, end);
        }
        return start;
    }

}
