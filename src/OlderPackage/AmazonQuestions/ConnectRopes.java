package OlderPackage.AmazonQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConnectRopes {
    public static int connectRopes(int[] ropes) {
        List<Integer> lst = Arrays.stream(ropes)        // IntStream
                .boxed()          // Stream<Integer>
                .collect(Collectors.toList());
        int ans = 0;
        while (lst.size() > 1) {
            if (lst.size() > 1) {
                Collections.sort(lst);
                int temp = (int) lst.get(0) + (int) lst.get(1);
                lst.remove(1);
                lst.remove(0);
                lst.add(temp);
                ans += temp;
            } else {
                int temp = lst.get(0);
                ans += temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ropes = {10, 12, 8, 10, 5};
        System.out.println(connectRopes(ropes));

    }

}
