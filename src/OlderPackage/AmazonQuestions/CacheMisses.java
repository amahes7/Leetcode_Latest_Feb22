package OlderPackage.AmazonQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CacheMisses {
    public static int lruCacheMisses(int num, List<Integer> pages, int maxCacheSize) {
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int page : pages) {
            if (!queue.contains(page)) {
                if (queue.size() < maxCacheSize) {
                    queue.add(page);
                    result++;
                }else if (queue.size() == maxCacheSize){
                    queue.remove();
                    result++;
                    queue.add(page);
                }
            }else{
                    queue.remove(page);
                    queue.add(page);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 6;
        List<Integer> pages = new ArrayList();
        pages.add(1);
        pages.add(2);
        pages.add(1);
        pages.add(3);
        pages.add(1);
        pages.add(2);
        int maxCacheSize = 3;
        System.out.println("Tha value is " + lruCacheMisses(num, pages, maxCacheSize));
    }

}
