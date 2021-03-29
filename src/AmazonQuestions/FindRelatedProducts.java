package AmazonQuestions;

import java.util.*;

public class FindRelatedProducts {

    public static List<String> findLargestGroup(List<List<String>> items) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (List<String> item : items) {
            for (int i = 0; i < item.size(); i++) {
                if (!map.containsKey(item.get(i))) {
                    if (i == 0) {
                        List<String> temp = new ArrayList<>();
                        temp.add(item.get(i + 1));
                        map.put(item.get(i), temp);
                    } else {
                        List<String> temp = new ArrayList<>();
                        temp.add(item.get(i - 1));
                        if (i != item.size() - 1) {
                            temp.add(item.get(i + 1));
                        }
                        map.put(item.get(i), temp);
                    }
                } else {
                    if (i == 0) {
                        List<String> temp = map.get(item.get(i));
                        temp.add(item.get(i + 1));
                        map.put(item.get(i), temp);
                    } else {
                        List<String> temp = map.get(item.get(i));
                        temp.add(item.get(i - 1));
                        map.put(item.get(i), temp);
                    }
                }

            }
        }
        int max = Integer.MIN_VALUE;
        for (String key : map.keySet()) {
            if (map.get(key).size() >= max) {
                max=map.get(key).size();
                result = map.get(key);
                result.add(key);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("p1");
        list1.add("p2");
        list1.add("p3");
        List<String> list2 = new ArrayList<>();
        list2.add("p5");
        list2.add("p2");
        List<String> list3 = new ArrayList<>();
        list3.add("p2");
        list3.add("p6");
        List<String> list4 = new ArrayList<>();
        list4.add("p6");
        list4.add("p7");
        List<String> list5 = new ArrayList<>();
        list5.add("p8");
        list5.add("p7");
        List<List<String>> input = new ArrayList<>();
        input.add(list1);
        input.add(list2);
        input.add(list3);
        input.add(list4);
        input.add(list5);
        System.out.println(findLargestGroup(input));
    }
}
