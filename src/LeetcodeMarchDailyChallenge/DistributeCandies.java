package LeetcodeMarchDailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        int count = candyType.length / 2;
        int types = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : candyType) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
                types++;
            }
        }
        if (types >= count) {
            return count;
        } else {
            return types;
        }
    }

    public static void main(String[] args) {
        DistributeCandies mismatch = new DistributeCandies();
        int arr[] = {1, 1, 2, 2, 3, 3};
        int n = arr.length;
        mismatch.distributeCandies(arr);
    }
}
