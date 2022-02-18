package leetcode_new.Medium;

import java.util.*;

import static java.util.stream.Collectors.toMap;

public class topKFrequentWords {

    public static void main(String[] args) {
        String[] input = new String[]{"i","love","leetcode","i","love","coding"};
        List<String> output = topKFrequent(input, 2);
        for (String a : output) System.out.println(a);
    }


    public static List<String> topKFrequent(String[] words, int k) {
//        Map<String, Integer> fMap = new HashMap<>();
//        List<String> result = new ArrayList<>();
//        for (String word : words) {
//            fMap.put(word, fMap.getOrDefault(word, 0) + 1);
//        }
//        fMap = fMap.entrySet()
//                .stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
//
//        for (Map.Entry entry : fMap.entrySet()) {
//            while (k > 0) {
//                result.add((String) entry.getKey());
//                k--;
//                break;
//            }
//        }
//        return result;



        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> arr = new ArrayList<>();

        for(String w: words)
            map.put(w, map.getOrDefault(w, 0) + 1);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(v1,v2)->{
            if(v1.getValue() == v2.getValue()) return v1.getKey().compareTo(v2.getKey());
            else return v2.getValue()-v1.getValue();
        });

        int count = 0;
        for(Map.Entry<String, Integer> i: list){
            if(count++ < k)
                arr.add(i.getKey());
        }

        return arr;
    }
}
