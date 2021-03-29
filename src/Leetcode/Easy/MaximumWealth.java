package Leetcode.Easy;

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int wealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            ;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if (temp > wealth) wealth = temp;
        }
        return wealth;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
//        nextGreaterElement(nums1, nums2);
    }
}
