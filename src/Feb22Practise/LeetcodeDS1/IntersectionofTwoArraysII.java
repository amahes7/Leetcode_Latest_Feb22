package Feb22Practise.LeetcodeDS1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArraysII {


    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i]<nums2[j])i++;
            else if (nums1[i]>nums2[j])j++;
        }
        return result.stream().mapToInt(a->a).toArray();
    }
}
