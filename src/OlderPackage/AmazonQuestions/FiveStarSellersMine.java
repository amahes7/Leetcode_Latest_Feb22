package OlderPackage.AmazonQuestions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FiveStarSellersMine {

    public static int fiveStarReviews(List<List<Integer>> productRatings, int ratingThreshold) {
        int num = 0;
        double curRating = 0;
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((l1, l2) -> diff(l2) - diff(l1));
        for (List<Integer> rating : productRatings) {
            pq.offer(rating);
            curRating += 100 * rating.get(0) / rating.get(1);
        }
        while (curRating < ratingThreshold * productRatings.size()) {
            num++;
            List<Integer> r = pq.poll();
            List<Integer> nr = Arrays.asList(r.get(0) + 1, r.get(1) + 1);
            curRating = curRating - (100 * r.get(0) / r.get(1)) + (100 * nr.get(0) / nr.get(1));
            pq.offer(nr);
        }
        return num;
    }

    private static int diff(List<Integer> p) {
        double cR = 100 * p.get(0) / p.get(1);
        double nR = 100 * (p.get(0) + 1) / (p.get(1) + 1);
        return (int) (nR - cR);
    }

    public static void main(String[] args) throws IOException {
        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(4, 4));
        List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1, 2));
        List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(3, 6));

        List<List<Integer>> list1 = new ArrayList<>();
        list1.add(l1);
        list1.add(l2);
        list1.add(l3);

        int thresh = 77;

        System.out.print(fiveStarReviews(list1, thresh));

    }
}
