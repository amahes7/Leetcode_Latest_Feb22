package OlderPackage.AmazonQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TransactionLogs {
    public static String[] processLogFile(String[] logs, int threshold) {
        TreeMap<String, Integer> map = new TreeMap<>();
        List result = new ArrayList<>();
        for (String log : logs) {
            String[] item = log.split(" ");
            String s_user = item[0];
            String r_user = item[1];
            int amount = Integer.parseInt(item[2]);
            int max_value = 999999999;
            if (Integer.parseInt(s_user) > max_value || Integer.parseInt(r_user) > max_value || amount > max_value) return null;
            if (map.containsKey(s_user)) {
                map.put(s_user, map.get(s_user) + 1);
            } else {
                map.put(s_user, 1);
            }
            if (map.containsKey(r_user) && !s_user.equalsIgnoreCase(r_user)) {
                map.put(r_user, map.get(r_user) + 1);
            } else {
                map.put(r_user, map.getOrDefault(r_user,1));
            }
        }
        for (String key : map.descendingKeySet()) {
            if (map.get(key) >= threshold) {
                result.add(key);
            }
        }
        return (String[]) result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String[] input = {"88 088 200", "88 99 300", "99 32 100", "12 12 15","12 13 15" };
        for (String a : processLogFile(input, 2)) {
            System.out.println(a);
        }
    }

}
