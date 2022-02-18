package Graph.geekforgeeks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Traversal {


    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(0);
        visited[0] = true;
        while (queue.size() != 0) {
            int num = queue.poll();
            result.add(num);
            Iterator<Integer> i = adj.get(num).listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return result;
    }


    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        dfsUtil(adj, visited, 0, result);
        return  result;
    }

    public void dfsUtil(ArrayList<ArrayList<Integer>> adj, boolean visited[], int x, ArrayList<Integer> result) {
        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(x);
        visited[x] = true;
        while (queue.size() != 0) {
            int num = queue.poll();
            result.add(num);
            Iterator<Integer> i = adj.get(num).listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    dfsUtil(adj, visited, n, result);
                }
            }
        }

    }
}
