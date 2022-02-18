package MustCodingQuestions.Google;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int[] singleNumber(int[] nums)
    {
        int[] result = new int[2];
        int count =0;
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int n:nums){
           numMap.put(n,numMap.getOrDefault(n,0)+1);
        }
        for(Map.Entry entry: numMap.entrySet()){
            if((int)entry.getValue() == 1){
                result[count] =(int)entry.getValue();
                count ++;
            }
            if(count ==2) break;
        }
        return result;
    }
}
