package leetcode_new.Medium;

import java.util.ArrayList;
import java.util.List;

public class Kthfactor {

    public int kthFactor(int n, int k) {
        if (k == 1) return 1;
        if (k > n) return -1;
        k--;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) k--;
            if (k == 0) return i;
        }
        return -1;
    }
}
