package Leetcode.AmazonEasy;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

public class MostCommonWord {

    public static void main(String[] args) {
        MostCommonWord MostCommonWord = new MostCommonWord();
        System.out.println(MostCommonWord.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ");
        String[] words = paragraph.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (!set.contains(word)) map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
