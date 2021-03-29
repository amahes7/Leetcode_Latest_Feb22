package Leetcode.Tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class MergeTwoTrees {

    // A Binary Tree Node
    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        public Node() {

        }
    }

    // Returns true if trees with root1 and root2
    // are level by level anagram, else returns false.

    static Node mergeTrees(Node root1, Node root2) {
//        Node result = new Node();
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        root1.data +=root2.data;
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right,root2.right);
        return root1;
    }

    // Driver program to test above functions
    public static void main(String args[]) {
        // Constructing both the trees.
        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(2);
        root1.right.left = new Node(5);
        root1.right.right = new Node(4);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);


        mergeTrees(root1, root2);
        System.out.println("hello");

    }
}
