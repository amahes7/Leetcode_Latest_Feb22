package leetcode_new.Medium;

public class BuysAndSellShareLC122 {

    public static void main(String[] args) {
        int[] p = new int[]{3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(p));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0, valley = prices[0], peak = prices[0], i = 0;
        int n = prices.length;
        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) i++;
            valley = prices[i];
            while (i < n - 1 && prices[i] <= prices[i + 1]) i++;
            peak = prices[i];
            maxProfit += peak - valley;
        }
        return maxProfit;
    }
}
