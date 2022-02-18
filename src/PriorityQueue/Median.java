package PriorityQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Median {


    public static double findMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);

        // check for even case
        if (n % 2 != 0)
            return (double)a[n / 2];

        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }


    //A min-heap that contains the larger half of the elements, with the minimum element at the root
    //A max-heap that contains the smaller half of the elements, with the maximum element at the root


    //we begin with two heaps – a min-heap and a max-heap.
    // Next, let's introduce a condition: the size of the max-heap must be (n / 2) at all times,
    // while the size of the min-heap can be either (n / 2) or (n / 2) + 1,
    // depending on the total number of elements in the two heaps.
    // In other words, we can allow only the min-heap to have an extra element, when the total number of elements is odd.


    private Queue<Integer> minHeap, maxHeap;

    void MedianOfIntegerStream() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    void add(int num) {
        if (minHeap.size() == maxHeap.size()) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        } else {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
    }

    double getMedian() {
        int median;
        if (minHeap.size() > maxHeap.size()) {
            median = minHeap.peek();
        } else {
            median = (minHeap.peek() + maxHeap.peek()) / 2;
        }
        return median;
    }


}
