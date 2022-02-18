package OlderPackage.AmazonQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillTheTruck {
    public static int fillTheTruck(int num, int[] boxes, int unitSize, int[] unitsPerBox, long truckSize) {
        List<Integer> result = new ArrayList<>();
        int ans=0;
        for(int i=0;i<boxes.length;i++){
            for(int j=0;j<boxes[i];j++){
                result.add(unitsPerBox[i]);
            }
        }
        Collections.sort(result,Collections.reverseOrder());
        if(result.size()<truckSize){
            truckSize=result.size();
        }
        for(int i=0;i<truckSize;i++){
            ans+= result.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] boxes = {1,3,2,2,1};
        int[] unitsPerBox = {9,8,9,5,8};
        int num = 5;
        int unitSize = 5;
        long truckSize = 4;
        System.out.println(fillTheTruck(num, boxes, unitSize, unitsPerBox, truckSize));

    }
}
