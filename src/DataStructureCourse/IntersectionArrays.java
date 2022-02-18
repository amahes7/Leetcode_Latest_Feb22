package DataStructureCourse;

import java.util.*;

public class IntersectionArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums1) map1.put(num, map1.getOrDefault(num, 0) + 1);
        for (int num : nums2) {
            if (map1.containsKey(num)) {
                list.add(num);
                map1.put(num, map1.get(num) - 1);
                if (map1.get(num) == 0) map1.remove(num);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }


    public int[] intersectOP(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
        }
        return list.stream().mapToInt(n->n).toArray();
    }
}
