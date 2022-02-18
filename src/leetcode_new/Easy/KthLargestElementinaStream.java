package leetcode_new.Easy;

import java.util.PriorityQueue;

public class KthLargestElementinaStream {

    private int k;
    private PriorityQueue<Integer> pq;

    public KthLargestElementinaStream(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);
        }
        while (pq.size() > k) pq.poll();
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size()>k) pq.poll();
        return pq.peek();
    }
}
