package AmazonQuestions;

import java.lang.reflect.Array;
import java.util.*;

public class HighestProfit {
    public static int maximum_profit(int[] inventory, int order) {
        int ans = 0;
        int num=inventory.length;
        for(int i=1;i<=order;i++){
            Arrays.sort(inventory);
            ans += inventory[num-1];
            inventory[num-1]= inventory[num-1] -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] inventory = {3,5};
        int order = 6;
        int profit = maximum_profit(inventory, order);
        System.out.println("Total Profit is:  " + profit);
    }
}
