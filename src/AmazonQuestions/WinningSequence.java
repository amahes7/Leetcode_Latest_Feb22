package AmazonQuestions;

import java.util.Arrays;

public class WinningSequence {

    public static int[] winningSequence(int num, int lowerNum, int upperNum) {
        int[] result = new int[num];
        if ((upperNum - lowerNum) < num - 2) {
            result[0] = -1;
            return result;
        }
        else{
            result[0]=upperNum-1;
            for(int i=1;i<num;i++){
                result[i]=upperNum;
                upperNum--;
            }
        }
        return result;
    }

    public static void main (String[] args){
        int[] result =winningSequence(5,3,5);
        for(int i=0;i<5;i++){
            System.out.println(result[i]);
        }
    }
}