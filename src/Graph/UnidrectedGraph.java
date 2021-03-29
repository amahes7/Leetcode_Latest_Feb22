package Graph;

// Java code to demonstrate Graph representation
// using ArrayList in Java

import java.util.*;

class Graph {

    // A utility function to add an edge in an
    // undirected graph
//    static void addEdge(ArrayList<ArrayList<Integer> > adj,
//                        int u, int v)
//    {
//        adj.get(u).add(v);
//        adj.get(v).add(u);
//    }
//
//    // A utility function to print the adjacency list
//    // representation of graph
//    static void printGraph(ArrayList<ArrayList<Integer> > adj)
//    {
//        for (int i = 0; i < adj.size(); i++) {
//            System.out.println("\nAdjacency list of vertex" + i);
//            System.out.print("head");
//            for (int j = 0; j < adj.get(i).size(); j++) {
//                System.out.print(" -> "+adj.get(i).get(j));
//            }
//            System.out.println();
//        }
//    }
//
//    // Driver Code
//    public static void main(String[] args)
//    {
//        // Creating a graph with 5 vertices
//        int V = 5;
//        ArrayList<ArrayList<Integer> > adj
//                = new ArrayList<ArrayList<Integer> >(V);
//
//        for (int i = 0; i < V; i++)
//            adj.add(new ArrayList<Integer>());
//
//        // Adding edges one by one
//        addEdge(adj, 0, 1);
//        addEdge(adj, 0, 4);
//        addEdge(adj, 1, 2);
//        addEdge(adj, 1, 3);
//        addEdge(adj, 1, 4);
//        addEdge(adj, 2, 3);
//        addEdge(adj, 3, 4);
//
//        printGraph(adj);
//    }

    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists

    void BFS(int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }



    void DFSUtil(int v, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // The function to do DFS traversal. It uses recursive
    // DFSUtil()
    void DFS()
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper function to print DFS
        // traversal starting from all vertices one by one
        for (int i = 0; i < V; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
    }
}
