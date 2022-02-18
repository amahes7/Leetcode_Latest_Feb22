package Feb22Practise.LeetcodeDS1;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count1 = m - 1, count2 = n - 1, index = nums1.length - 1;
        while (count1 >= 0 && count2 >= 0) {
            if (nums1[count1] > nums2[count2]) {
                nums1[index] = nums1[count1];
                count1--;
                index--;
            } else if (nums1[count1] <= nums2[count2]) {
                nums1[index] = nums2[count2];
                count2--;
                index--;
            }
        }
        while (count1>=0){
            nums1[index] = nums1[count1];
            count1--;
            index--;
        }
        while (count2>=0){
            nums1[index] = nums2[count2];
            count2--;
            index--;
        }
    }
}
