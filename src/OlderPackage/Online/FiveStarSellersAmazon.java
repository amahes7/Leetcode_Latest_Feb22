package OlderPackage.Online;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;


public class FiveStarSellersAmazon {

    public static int fiveStarReviews(List<List<Integer>> productRatings, int ratingThreshold) {
        int num = 0;
        double curRating = 0;
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((l1, l2) -> diff(l2) - diff(l1)); // max-heap.
        for (List<Integer> rating : productRatings){
            pq.offer(rating); // initialize PriorityQueue.
            curRating += 100.0 * rating.get(0) / rating.get(1); // initialize curRating.
        }
        while (curRating < ratingThreshold * productRatings.size()) {
            num++;
            List<Integer> rating = pq.poll();
            List<Integer> newRating = Arrays.asList(rating.get(0) + 1, rating.get(1) + 1);
            curRating = curRating - 100.0 * rating.get(0) / rating.get(1) + 100.0 * newRating.get(0) / newRating.get(1); // keep updating the rating.
            pq.offer(newRating);
        }
        return num;
    }

    // the diff between the current product rating and the product added one more five-star rating.
    private static int diff(List<Integer> p) {
        double currRating = 100.0 * p.get(0) / p.get(1);
        double newRating = 100.0 * (p.get(0) + 1) / (p.get(1) + 1);
        return (int) (newRating - currRating);
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