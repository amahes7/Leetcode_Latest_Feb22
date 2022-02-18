package TopInterviewQuestions.Easy.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 9, 5, 4,8};
        int[] arr2 = new int[]{9, 4, 9, 8, 4};
        intersect(arr1, arr2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList();
        Map<Integer, Integer> map1 = convertToMap(nums1);
        Map<Integer, Integer> map2 = convertToMap(nums2);
        Map<Integer, Boolean> visited = new HashMap<>();
        for (int n : nums1) {
            visited.put(n, visited.getOrDefault(n,false));
            if (map1.containsKey(n) && map2.containsKey(n) && !visited.get(n)) {
                int i = Math.min(map1.get(n), map2.get(n));
                while (i > 0) {
                    result.add(n);
                    i--;
                }
            }
            visited.put(n, true);
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static Map<Integer, Integer> convertToMap(int[] arr) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int n : arr) {
            result.put(n, result.getOrDefault(n, 0) + 1);
        }
        return result;
    }
}
