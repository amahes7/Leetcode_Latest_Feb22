package PriorityQueue;

import java.util.PriorityQueue;

public class PQDemo {
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.offer(12);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek()); // 10

        // Printing the top element and removing it
        // from the PriorityQueue container
//        System.out.println(pQueue.poll());
        System.out.println(pQueue.remove());//removes 10
        System.out.println(pQueue.peek());// 12
        // Printing the top element again
        System.out.println(pQueue.peek());//12
    }
}
