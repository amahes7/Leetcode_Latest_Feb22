package OlderPackage.Online;

import java.util.*;

public class Trial1 {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Map<Integer, Set<Integer>> map = new HashMap<>();

    static void areAnagrams(Node root1, Node root2) {
        if (root1 == null || root2 == null) return;
        Queue<Node> q1 = new LinkedList<Node>();
        q1.add(root1);
        Queue<Node> q2 = new LinkedList<Node>();
        q2.add(root2);
        int level = 1;
        while (true) {
            int n1 = q1.size(), n2 = q2.size();
            if (n1 != n2) break;
            if (n1 == 0) break;
            Set<Integer> curr_list1 = new TreeSet<>();
            Set<Integer> curr_list2 = new TreeSet<>();
            while (n1 > 0) {
                Node node1 = q1.peek();
                q1.remove();
                if (node1.left != null) q1.add(node1.left);
                if (node1.right != null) q1.add(node1.right);

                Node node2 = q2.peek();
                q2.remove();
                if (node2.left != null) q2.add(node2.left);
                if (node2.right != null) q2.add(node2.right);

                curr_list1.add(node1.data);
                curr_list2.add(node2.data);
                n1--;
            }
            if (curr_list1.equals(curr_list2)) {
                map.put(level, curr_list1);
            }
            level++;
        }
    }

    public static void main(String args[]) {
        // Constructing both the trees.
        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(2);
        root1.right.left = new Node(5);
        root1.right.right = new Node(4);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(6);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);


        areAnagrams(root1, root2);
        System.out.println(map);
    }
}
