package Here;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxFrequency {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(4);
        System.out.println("Array Max key : " + MaxFreqForArray(list));

    }

    private static int MaxFreqForArray(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        int resultKey = -1;
        int resultValue = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                resultValue = max;
                resultKey = entry.getKey();
            }
        }
        return resultKey;
    }
}
