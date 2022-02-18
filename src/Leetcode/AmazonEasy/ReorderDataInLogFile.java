package Leetcode.AmazonEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReorderDataInLogFile {

    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> letlogs = new ArrayList<>();
        ArrayList<String> diglogs = new ArrayList<>();
        for (String log : logs) {
            String[] temp = log.split(" ");
            if (Character.isDigit(temp[1].charAt(0))) {
                diglogs.add(log);
            } else {
                letlogs.add(log);
            }
        }
        Collections.sort(letlogs, (log1, log2) -> {
                    String[] l1 = log1.split(" ", 2);
                    String[] l2 = log2.split(" ", 2);
                    if (l1[1].compareTo(l2[1]) == 0) return l1[0].compareTo(l2[0]);
                    else return l1[1].compareTo(l2[1]);
                }
        );
        String[] result = new String[logs.length];
        int index = 0;
        for (String log : letlogs) {
            result[index] = log;
            index++;
        }
        for (String log : diglogs) {
            result[index] = log;
            index++;
        }
        return result;
    }
}
