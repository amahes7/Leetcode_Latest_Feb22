package DFSTree;

import java.util.HashSet;

class Node{
    int data;
    Node left,right;

    public Node(int item){
        data=item;
        left=right=null;
    }
}
class BinaryTree{

    Node root;
    public BinaryTree(){
        root = null;
    }

    public static void main(String[] args)
    {


        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(1);
        tree.root.right = new Node(1);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(1);


        BinaryTree tree1 = new BinaryTree();

        tree1.root = new Node(5);
        tree1.root.left = new Node(3);
        tree1.root.right = new Node(6);
        tree1.root.left.left = new Node(2);
        tree1.root.left.right = new Node(4);
        tree1.root.left.left.left = new Node(1);
        tree1.root.right.right = new Node(8);
        tree1.root.right.right.left = new Node(7);
        tree1.root.right.right.right = new Node(9);



//        System.out.println("\nInorder traversal of binary tree is ");
//        tree1.printInorder();
//        System.out.println("\nPreOrder traversal of binary tree is ");
//        tree.printPreorder();
//        System.out.println("\nPostOrder traversal of binary tree is ");
//        tree.printPostorder();
        System.out.println(tree.isUnivalTree());
    }

    private boolean isUnivalTree() {
        if (root == null) return false;
        HashSet<Integer> set = new HashSet<>();
        return ifUnivalTree(root, set);

    }

    private boolean ifUnivalTree(Node root, HashSet<Integer> set) {
        if (!set.contains(root.data)) {
            set.add(root.data);
        }
        if(root.left != null) {
            ifUnivalTree(root.left, set);
        }
        if(root.right != null){
            ifUnivalTree(root.right, set);
        }
        if (set.size() > 1) {
            return false;
        } else {
            return true;
        }
    }

    private void printPreorder() {
        printPreorder(root);
    }

    private void printPreorder(Node root) {
        if(root == null) return;
        System.out.println(root.data);
        printPreorder(root.left);
        printPreorder(root.right);
    }

    private void printPostorder() {
        printPostorder(root);
    }

    private void printPostorder(Node root) {
        if(root == null) return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.println(root.data);
    }

    private void printInorder(Node root) {
        if(root == null) return ;
        printInorder(root.left);
        System.out.println((root.data));
        printInorder(root.right);
    }
    private void printInorder() {
        printInorder(root);
    }
}