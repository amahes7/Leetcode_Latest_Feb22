package leetcode_new.Medium;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSumWithSort(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i) {
            if (i == 0 || nums[i - 1] != nums[i]) helper(nums, i, result);
        }
        return result;
    }

    private void helper(int[] nums, int i, List<List<Integer>> result) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int j = i + 1; j < nums.length; j++) {
            int third = -(nums[i] + nums[j]);
            if (seen.contains(third)) {
                result.add(Arrays.asList(nums[i], nums[j], third));
                while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
            }
            seen.add(nums[j]);
        }
    }


    public List<List<Integer>> threeSumNoSort(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; j++) {
                    int third = -(nums[i] + nums[j]);
                    if (seen.containsKey(third) && seen.get(third) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                        Collections.sort(triplet);
                        result.add(triplet);
                    } else {
                        seen.put(nums[j], i);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

}
