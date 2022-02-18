package trees.DFS;

import java.util.HashSet;

class Node {
    int data = Integer.MIN_VALUE;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {

    static Node root;
    static Node root1;
    static int min = Integer.MAX_VALUE;

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(7);
        tree.root.left = new Node(6);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(2);


        BinaryTree tree1 = new BinaryTree();
        tree1.root1 = new Node(1);
        tree1.root1.left = new Node(1);
        tree1.root1.right = new Node(1);
        tree1.root1.left.left = new Node(1);
        tree1.root1.left.right = new Node(1);
        tree1.root1.right.right = new Node(1);

        System.out.println("PostOrder of Tree: ");
        postOrderTraversal(root);

        System.out.println("\nPreOrder of Tree: ");
        preOrderTraversal(root);

        System.out.println("\nInOrder of Tree: ");
        inOrderTraversal(root);
    }


    private static void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    private static void preOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    private static void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }


}
