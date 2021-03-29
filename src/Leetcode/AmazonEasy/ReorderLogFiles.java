package Leetcode.AmazonEasy;

import java.util.*;

public class ReorderLogFiles {
    public static String[] reorderLogFiles(String[] logs) {
        List<String> result = new ArrayList<>();
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        for (String log : logs) {
            String[] logWords = log.split(" ");
            if (logWords[1].charAt(0) > 96 && logWords[1].charAt(0) < 123) {
                letterLogs.add(log);
            } else {
                digitLogs.add(log);
            }
        }
        letterLogs = sortLetterlogs(letterLogs);
        for (String log : letterLogs) {
            result.add(log);
        }
        for (String log : digitLogs) {
            result.add(log);
        }
        return result.toArray(new String[result.size()]);
    }

    private static List<String> sortLetterlogs(List<String> letterLogs) {
        List<String> sortList = new ArrayList<>();
        Map<String,String> map = new TreeMap<>();
        for(String log:letterLogs){
            String[] logWords = log.split(" ",2);
            map.put(logWords[0],logWords[1]);
            map= sortByValues(map);

        }
        for(Map.Entry<String,String> e:map.entrySet()){
            sortList.add(e.getKey()+" "+ e.getValue());
        }
        return sortList;
    }



    private static Map<String, String> sortByValues(Map<String, String> map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

    public static void main(String[] args) {
        String[] input = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"};
        reorderLogFiles(input);
    }
}
