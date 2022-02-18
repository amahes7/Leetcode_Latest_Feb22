package MustCodingQuestions.Microsoft;

import java.util.*;

public class kLargestElemets {

//    public static ArrayList<Integer> kLargest(int[] arr, int n, int k)
//    {
//        ArrayList<Integer> result = new ArrayList<>();
//        int [] array = Arrays.stream(arr).boxed()
//                .sorted(Collections.reverseOrder())
//                .mapToInt(Integer::intValue)
//                .toArray();
//
//        for(int i=0;i<k;i++)  result.add(array[i]);
//        return result;
//    }


//    public static ArrayList<Integer> kLargest(int[] arr, int n, int k) {
//        ArrayList<Integer> result = new ArrayList<>();
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        for (int i = 0; i < k; i++) minHeap.add(arr[i]);
//        for (int i = k; i < n; i++) {
//            if (minHeap.peek() < arr[i]) {
//                minHeap.poll();
//                minHeap.add(arr[i]);
//            }
//        }
//        Iterator it = minHeap.iterator();
//        while (it.hasNext()) {
//            result.add((int) it.next());
//        }
//        return result;
//    }

    public static ArrayList<Integer> kLargest() {
        int[] arr = {12, 5, 787, 1, 23};
        int n = 5;
        int k = 2;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) maxHeap.poll();
        }
        Iterator it = maxHeap.iterator();
        while (it.hasNext()) {
            result.add((int) it.next());
        }
        return result;
    }
    public static void main(String[] args){
        kLargest();
    }
}
