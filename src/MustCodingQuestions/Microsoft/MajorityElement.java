package MustCodingQuestions.Microsoft;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static int majorityElement(int a[], int size) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (size == 0) return -1;
        else if(size == 1) return a[0];
        for (int num : a) {
            if (map.containsKey(num)) {
                int f = map.get(num)+1;
                if (f > size/2) return num;
                else {
                    map.put(num, f + 1);
                }
            } else {
                map.put(num, 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,12,1,12}, 4));
    }
}
