package AmazonQuestions;

import java.util.HashMap;

public class CheckInCheckOut {

    public static boolean winningSequence(int[] details) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean result = true;
        for (int i = 0; i < details.length; i++) {
            int user = details[i];
            if (map.containsKey(user)) {
                map.put(user, map.get(user) + 1);
            } else {
                map.put(user, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 2, 3, 3, 2, 1};
        System.out.println(winningSequence(input));
    }
}
