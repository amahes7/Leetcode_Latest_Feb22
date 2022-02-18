package DataStructureCourse;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 0, 0, 0};
        int[] input2 = {2, 5, 6};
        Arrays.stream(merge(input1, 3, input2, 3)).forEach(System.out::println);
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, index = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                i--;
                index--;
            } else if (nums1[i] <= nums2[j]) {
                nums1[index] = nums2[j];
                j--;
                index--;
            }


        }
        while (j >= 0) {
            nums1[index] = nums2[j];
            j--;
            index--;
        }

        while (i >= 0) {
            nums1[index] = nums1[i];
            i--;
            index--;
        }
        return nums1;
    }
}
