package Here;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyInMap {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("q",2);
        map.put("w",3);
        map.put("e",4);
        map.put("r",2);
        System.out.println(maxFreq(map));
    }

    private static String maxFreq(HashMap<String, Integer> map) {
        int maxCount=0;
        String maxString="";
        int curCount=0;
        for(Map.Entry entry:map.entrySet()){
            curCount = (int) entry.getValue();
            maxCount= Math.max(curCount,maxCount);
            if(curCount == maxCount){
                maxString=(String) entry.getKey();
            }
        }
        return maxString;
    }
}
