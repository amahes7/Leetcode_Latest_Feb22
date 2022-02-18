package Feb22Practise.LeetcodeDS1;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int result =0;
        int startPrice =Integer.MAX_VALUE;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<startPrice) startPrice = prices[i];
            else if(prices[i]-startPrice > result) result =prices[i]-startPrice;
        }
        return result;
    }
}
