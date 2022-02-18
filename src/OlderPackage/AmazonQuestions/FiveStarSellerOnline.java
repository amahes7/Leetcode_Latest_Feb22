package OlderPackage.AmazonQuestions;

import java.util.PriorityQueue;

public class FiveStarSellerOnline {

    public static int fiveStarReviews(int[][] productRatings, int ratingThreshold) {
        int num=0;
        double currentRating=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((l1,l2)-> diff(l2)-diff(l1));
        for(int[] rating:productRatings){
            pq.offer(rating);
            currentRating+= rating[0]*100/rating[1];
        }
        while(currentRating<ratingThreshold*productRatings.length){
            num++;
            int[] p = pq.poll();
            int[] q= {p[0]+1,p[1]+1};
            currentRating=currentRating + (100*q[0]/q[1]) - (100*p[0]/p[1]);
            pq.offer(q);
        }
        return num;
    }

    private static int diff(int[] p) {
        double cur = 100*p[0]/p[1];
        double nR=100*(p[0]+1)/(p[1]+1);
        return (int) (nR-cur);
    }
}
