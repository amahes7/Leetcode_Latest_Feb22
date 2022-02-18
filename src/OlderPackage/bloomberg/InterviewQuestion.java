package OlderPackage.bloomberg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class InterviewQuestion {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        sort(list, 5);
    }

    private static void sort(List<Integer> list, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        list.forEach(num -> {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        });
        List<Integer> result = new ArrayList<>(maxHeap);
        Collections.reverse(result);



    }

}
