package OlderPackage.AmazonQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiprocessorSystem {
    static int result = 0;

    static int getMinimumTime(int num, int[] ability, int p) {
        Arrays.sort(ability);
        List<Integer> list = Arrays.stream(ability).boxed().collect(Collectors.toList());
        int temp = ability[num - 1];
        if (list.contains(p)) {
            result++;
            return result;
        } else if (p > temp) {
            p = p - temp;
            ability[num - 1] = temp / 2;
            result++;
            getMinimumTime(num, ability, p);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {3, 1, 7, 2, 4};
        System.out.println(getMinimumTime(5, input, 20));
//        System.out.println(Math.ceil((double)7/2));
    }
}
