package Leetcode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaximumCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>();
        for(int index:candies){
                if((max-index)>extraCandies){
                    result.add(false);
                }else{
                    result.add(true);
                }
        }
        return result;
    }
}
