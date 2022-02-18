package trees.BFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    static void printLevelOrder() {
        int h = height(root);
        for (int i = 1; i <= h; i++) printGivenlevel(root, i);

    }

    private static int height(Node root) {
        if (root == null) return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight) return lheight + 1;
            else return rheight + 1;
        }
    }

    private static int minDepth(Node root) {
        if (root == null) return 0;
        else {
            int lheight = minDepth(root.left);
            int rheight = minDepth(root.right);

            if (lheight == 0) return rheight + 1;
            else if (rheight == 0) return lheight + 1;
            else if (lheight > rheight) return rheight + 1;
            else return lheight + 1;
        }
    }

    private static void printGivenlevel(Node root, int level) {
        if (root == null) return;
        if (level == 1) System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenlevel(root.left, level - 1);
            printGivenlevel(root.right, level - 1);
        }
    }


    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(3);
        tree.root.right.right = new Node(23);


        BinaryTree tree1 = new BinaryTree();
        tree1.root1 = new Node(1);
        tree1.root1.left = new Node(2);
        tree1.root1.right = new Node(3);
        Node result = insertRec(root,4);
        System.out.println("Hello");
//        System.out.println(isIdentical(root,root1));
//        tree1.root1.right.right = new Node(4);
//        tree1.root1.right.right.right = new Node(5);
//        tree1.root1.right.right.right.right = new Node(6);
//        tree1.root1.right.right = new Node(23);

//        System.out.println("Check is Same tree: " + isSameTrees(root, root1));
//        System.out.println("Check If Symmetric : " + isSymmetric(root));
//
//        System.out.println("Tree traversal: ");
//        printLevelOrder();
//
//        System.out.println("\nPrint level 1 of Tree: ");
//        printGivenlevel(root, 1);
//
//        System.out.println("\nPrint level 2 of Tree: ");
//        printGivenlevel(root, 2);
//
//        System.out.println("\nPrint level 3 of Tree: ");
//        printGivenlevel(root, 3);
//        int element = 1;
//        System.out.println("\nlevel of element " + element + " : " + getElementLevel(root, element));
//
//        System.out.println("Rightmost element: " + rightmost(root));
//        System.out.println("leftmost element: " + leftmost(root));
//        System.out.println(minDepth(root1));
    }

    private static Boolean isSymmetric(Node root) {
        if (root == null || (root.left == null && root.right == null)) return true;
        Node left = root.left;
        Node right = root.right;
        return isSymmetricUtil(left, right);
    }

    private static Boolean isSymmetricUtil(Node l, Node r) {
        if (l == null && r == null) return true;
        else if (l == null || r == null) return false;
        else if (l.data != r.data) return false;
        return isSymmetricUtil(l.left, r.right) && isSymmetricUtil(l.right, r.left);

    }

    private static Boolean isSameTrees(Node t1, Node t2) {
//        if (height(t1) != height(t2)) return false;
//        else {
        return isSameTreesUtil(t1, t2);
//        }
    }

    private static boolean isSameTreesUtil(Node t1, Node t2) {
        if (t1 == null && t2 == null) return true;
        else if (t1 == null || t2 == null) return false;
        if ((t1.data != t2.data) || !isSameTreesUtil(t1.left, t2.left) || !isSameTreesUtil(t1.right, t2.right))
            return false;
        return true;
    }

    private static int leftmost(Node root) {
        if (root.left == null) return root.data;
        else return leftmost(root.left);
    }

    private static int rightmost(Node root) {
        if (root.right == null) return root.data;
        else return rightmost(root.right);
    }

    private static int getElementLevel(Node root, int element) {
        return elementLevelUtil(root, element, 1);
    }

    private static int elementLevelUtil(Node root, int element, int level) {
        if (root == null) return 0;
        if (root.data == element) return level;
        if (element > root.data) return elementLevelUtil(root.right, element, level + 1);
        else return elementLevelUtil(root.left, element, level + 1);
    }

    private static boolean isIdentical(Node node1, Node node2) {
        if (node1 == null && node2 == null) return true;
        else if (node1 == null || node2 == null) return false;

        if (node1.data == node2.data) {
            return isIdentical(node1.left, node2.left)  && isIdentical(node1.right, node2.right);
        } else return false;
    }

    private Node mirror(Node node){
        if(root == null) return node;
        Node left = mirror(node.left);
        Node right = mirror(node.right);

        node.left = right;
        node.right = left;
        return node;

    }

    static Node insertRec(Node root, int key)
    {

        /* If the tree is empty,
           return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }


//    public boolean findTarget(Node root, int k) {
//        Set<Integer> set = new HashSet<>();
//        return helper(root,set,k);
//    }
//
//    private boolean helper(Node root, Set<Integer> set,int target) {
//        if (root == null) return false;
//        if (set.contains(target - root.data)) return true;
//        set.add(root.data);
//        return helper(root.left,set,target) || helper(root.right,set,target);
//    }
//
//
//    public boolean findTargetOP(Node root, int k) {
//        List<Integer> numList = new ArrayList<>();
//        inOrder(root,numList);
//        int l=0,r=numList.size()-1;
//        while(l<r){
//            int temp =numList.get(l)+ numList.get(r);
//            if (temp == k) return true;
//            else if (temp >k) r--;
//            else if (temp < k)l++;
//        }
//        return false;
//    }
//
//    private void inOrder(Node root, List<Integer> numList) {
//        if (root == null)return;
//        inOrder(root.left,numList);
//        numList.add(root.data);
//        inOrder(root.right,numList);
//    }
//
//    private boolean helper(Node root, Set<Integer> set,int target) {
//        if (root == null) return false;
//        if (set.contains(target - root.data)) return true;
//        set.add(root.data);
//        return helper(root.left,set,target) || helper(root.right,set,target);
//    }


}
