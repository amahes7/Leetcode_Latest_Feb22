package leetcode_new.Easy;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, index = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                i--;
            } else {
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }
        while (i >= 0) {
            nums1[index] = nums1[i];
            i--;
            index--;
        }
        while (j >= 0) {
            nums1[index] = nums2[j];
            j--;
            index--;
        }


    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 4, 6, 9, 0, 0, 0, 0, 0};
        int[] num2 = new int[]{2, 3, 6, 7, 10};
        merge(num1, 4, num2, 5);
        Arrays.stream(num1).forEach(System.out::println);
    }
}
