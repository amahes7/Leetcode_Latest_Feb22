package TopInterviewQuestions.Easy.Array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] p = new int[]{1, 2, 2, 3, 1};
        System.out.println(singleNumber(p));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return singleKey(map, 1);
    }

    private static int singleKey(Map<Integer, Integer> map, int i) {
        for (int key : map.keySet()) {
            if (i == map.get(key)) {
                return key;
            }
        }
        return 0;
    }
}
