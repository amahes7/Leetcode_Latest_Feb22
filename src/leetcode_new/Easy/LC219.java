package leetcode_new.Easy;

import java.util.HashMap;
import java.util.Map;

public class LC219 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        int i = 0, j;
        while (i < nums.length - 1) {
            j = i + 1;
            while (j < nums.length) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) return true;
                j++;
            }
            i++;
        }
        return false;
    }

//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int index = 0; index < nums.length; index++) {
//           if(map.containsKey(nums[index])){
//               int previndex= map.get(nums[index]);
//               if(Math.abs(previndex -index)<=k) return true;
//           }
//           map.put()
//        }
//        return false;
//    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        final Map<Integer, Integer> occurences = new HashMap<>();
        for (int ind = 0; ind < nums.length; ind++) {
            if (occurences.containsKey(nums[ind])) {
                final int prev = occurences.get(nums[ind]);
                if (ind - prev <= k) {
                    return true;
                }
            }
            occurences.put(nums[ind], ind);
        }
        return false;
    }

}
