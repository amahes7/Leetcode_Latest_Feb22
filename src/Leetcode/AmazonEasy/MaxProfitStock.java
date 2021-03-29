package Leetcode.AmazonEasy;

public class MaxProfitStock {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int lowest= prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]< lowest) {
                lowest=prices[i];
            }else if(prices[i]-lowest > maxProfit){
                maxProfit=prices[i]-lowest;
            }
        }
        return maxProfit;
    }
}
