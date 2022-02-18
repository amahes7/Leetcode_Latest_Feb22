package OlderPackage.AmazonQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiskSpace {

    static int maxDiskSpace(int numComputer, List<Integer> hardDiskSpace, int segmentLength) {
        List<Integer> resultList = new ArrayList<>();
        for(int i=0;i<(numComputer-segmentLength+1);i++){
            int minSpace=Integer.MAX_VALUE;
            for(int j=i;j<i+ segmentLength;j++){
                minSpace= Math.min(minSpace,hardDiskSpace.get(j));
            }
            resultList.add(minSpace);
        }
        Collections.sort(resultList,Collections.reverseOrder());
        return resultList.get(0);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(4);
        System.out.println(maxDiskSpace(3, list, 2));

    }
}
