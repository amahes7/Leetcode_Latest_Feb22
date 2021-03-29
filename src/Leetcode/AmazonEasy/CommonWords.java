package Leetcode.AmazonEasy;

import java.util.*;

public class CommonWords {
    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> map = new HashMap<>();
        List<String> bannedList = Arrays.asList(banned);
        String[] words = paragraph.replaceAll("[,_\"-.!?:;)(}{]", " ").split( "[\\s,]+" );
        for(String word:words){
            if(!bannedList.contains(word.toLowerCase()))
            map.put(word.toLowerCase(),map.getOrDefault(word.toLowerCase(),0)+1);
        }

        Map.Entry<String,Integer> maxEntry = map.entrySet().stream().max((Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2) -> e1.getValue().compareTo(e2.getValue())).orElse(new Map.Entry<String, Integer>() {
            @Override
            public String getKey() {
                return null;
            }

            @Override
            public Integer getValue() {
                return null;
            }

            @Override
            public Integer setValue(Integer value) {
                return null;
            }
        });
        return maxEntry.getKey();
    }


    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph,banned));
    }
}
