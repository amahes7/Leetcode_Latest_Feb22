package leetcode_new.Easy;

import java.util.*;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        if (set.size() < 3) return Collections.max(set);
        else {
            List<Integer> numbersList = new ArrayList<Integer>(set);
            Collections.sort(numbersList, Collections.reverseOrder());
            return numbersList.get(2);
        }
    }

    public int thirdMaxOP(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums){
            set.add(num);
            if (set.size()>3){
                set.remove(Collections.min(set));
            }
        }
        if (set.size()==3) return Collections.min(set);
        else return Collections.max(set);
    }

    public static void main(String[] args) {
        ThirdMaximumNumber ThirdMaximumNumber = new ThirdMaximumNumber();
        int[] input = new int[]{1, 2,2};
        System.out.println(ThirdMaximumNumber.thirdMax(input));
    }
}
