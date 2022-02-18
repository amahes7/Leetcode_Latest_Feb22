package leetcode_new.Hard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BuyAndSellStockLC123 {
    public static void main(String[] args) {
        int[] p = new int[]{1,2,4,2,5,7,2,4,9,0};
        System.out.println(maxProfit(p));
    }


    public static int maxProfit(int[] prices) {
        int peak = prices[0];
        int valley = prices[0];
        List<Integer> profit = new ArrayList<>();
        int i = 0;
        int n = prices.length;
        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) i++;
            valley = prices[i];
            while (i < n - 1 && prices[i] <= prices[i + 1]) i++;
            peak = prices[i];
            profit.add(peak - valley);
        }
        if (profit.size() == 0) return 0;
        else if (profit.size() == 1) return profit.get(0);
        else if (profit.size() == 2) return profit.get(0) + profit.get(1);
        else {
            Collections.sort(profit, Collections.reverseOrder());
            return profit.get(0) + profit.get(1);
        }
    }

    public static int maxProfitNew(int[] prices) {
        int peak = prices[0];
        int valley = prices[0];
        List<Integer> profit = new ArrayList<>();
        int i = 0;
        int n = prices.length;
        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) i++;
            valley = prices[i];
            while (i < n - 1 && prices[i] <= prices[i + 1]) i++;
            peak = prices[i];
            profit.add(peak - valley);
        }
        if (profit.size() == 0) return 0;
        else if (profit.size() == 1) return profit.get(0);
        else if (profit.size() == 2) return profit.get(0) + profit.get(1);
        else {
            Collections.sort(profit, Collections.reverseOrder());
            return profit.get(0) + profit.get(1);
        }
    }
}
