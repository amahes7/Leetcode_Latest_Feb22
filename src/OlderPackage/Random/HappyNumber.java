package OlderPackage.Random;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            n = nextNum(n);
        }
        return n == 1;
    }

    private int nextNum(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            sum += temp;
        }
        return sum;
    }
}
