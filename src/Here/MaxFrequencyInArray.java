package Here;

import java.util.*;

public class MaxFrequencyInArray {

    public static void main(String[] args){
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(4);
        System.out.println(repectCharInArray(list));

    }

    private static int repectCharInArray(List<Integer> list) {
        int maxCount=0;
        int curCount=0;
        int maxNum=list.get(0);
        Collections.sort(list);
        int cur = list.get(0);
        for(int num:list){
            if(num== cur){
                curCount++;
                maxNum=num;
                maxCount= Math.max(maxCount,curCount);
            }else{
                cur=num;
                curCount=1;
                maxCount= Math.max(maxCount,curCount);
            }
        }
        return maxCount;
    }
}
