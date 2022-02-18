package leetcode_new.Easy;

import java.util.HashMap;
import java.util.Map;

public class MAxProfitLC121 {

    public static void main(String[] args) {
        int[] p = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfitOptimum(p));
    }


    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0, j = 0, n = prices.length;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }
            }
        }
        return maxProfit;
    }


    public static int maxProfitOptimum(int[] prices) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        int i, n = prices.length;
        for (i = 0; i < n; i++) {
            if (prices[i] < minValue) minValue = prices[i];
            else if (prices[i] - minValue > maxProfit) maxProfit = prices[i] - minValue;
        }
        return maxProfit;
    }
}
