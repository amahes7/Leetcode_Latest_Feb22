package OlderPackage.AmazonQuestions;

import java.util.Arrays;

public class CutOffRanksProblem {

    public static int cutOffRank(int cutOffRank, int num, int[] scores) {
        int rank=1;
        int n=1;
        Arrays.sort(scores);
        for(int i=num-1;i>=0;i--){
            if(i == num-1 || scores[i] != scores[i+1]){
                rank=n;
                if(rank>cutOffRank) return n-1;
            }
            n++;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] scores ={100,50,50,25};
        System.out.println(cutOffRank(3, 4, scores));
    }
}
