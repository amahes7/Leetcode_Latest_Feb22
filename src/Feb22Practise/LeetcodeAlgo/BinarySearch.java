package Feb22Practise.LeetcodeAlgo;

import Feb22Practise.LeetcodeDS1.MaximumSubarray;

public class BinarySearch {
    public int search1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }

    private int helper(int[] nums, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (start>end) return -1;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return helper(nums, target, start, mid - 1);
        else if (nums[mid] < target) return helper(nums, target, mid + 1, end);
        return -1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{-1, 0, 3, 5, 9, 12};
        BinarySearch BinarySearch = new BinarySearch();
        System.out.println(BinarySearch.search(input, 9));
    }
}
