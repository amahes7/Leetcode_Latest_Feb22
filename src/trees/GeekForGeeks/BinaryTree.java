package trees.GeekForGeeks;

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
        tree.root = new Node(1);
        tree.root.left = new Node(6);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.right = new Node(23);


        BinaryTree tree1 = new BinaryTree();
        tree1.root1 = new Node(1);
        tree1.root1.right = new Node(5);
        tree1.root1.right.left = new Node(4);
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
//        System.out.println(getCount(root1, 4, 5));
        System.out.println(countPairs());
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

    static boolean search(Node root, int x) {
        if (root == null) return false;
        if (root.data == x) return true;
        boolean res1 = search(root.left, x);
        if (res1) return true;
        boolean res2 = search(root.right, x);
        return res2;
    }


    private static Boolean isUnivalNew(Node root) {
        if (root == null) return true;
        if (root.left != null && (root.data != root.left.data)) return false;
        if (root.right != null && (root.data != root.right.data)) return false;

        return isUnivalNew(root.left) && isUnivalNew(root.right);
    }

    static int min = Integer.MAX_VALUE;

    private static void minimumElement(Node root) {
        if (root == null) return;
        minimumElement(root.left);
        min = Math.min(min, root.data);
        minimumElement(root.right);
    }


    // Recursive function to build a binary search tree from
    // its postorder sequence
    public static Node constructBSTFromPostOrderSequence(int[] postorder, int start, int end) {
        // base case
        if (start > end) {
            return null;
        }

        // Construct the root node of the subtree formed by keys of the
        // postorder sequence in range `[start, end]`
        Node node = new Node(postorder[end]);

        // search the index of the last element in the current range of postorder
        // sequence, which is smaller than the root node's value
        int i;
        for (i = end; i >= start; i--) {
            if (postorder[i] < node.data) {
                break;
            }
        }

        // Build the right subtree before the left subtree since the values are
        // being read from the end of the postorder sequence.

        // recursively construct the right subtree
        node.right = constructBSTFromPostOrderSequence(postorder, i + 1, end - 1);

        // recursively construct the left subtree
        node.left = constructBSTFromPostOrderSequence(postorder, start, i);

        // return current node
        return node;
    }

    static int result = 0;

    public static int sumOfLeafNode(Node root) {
        sumOfLeafNodeHelper(root);
        return result;
    }

    private static void sumOfLeafNodeHelper(Node root) {
        if (root == null) return;
        sumOfLeafNodeHelper(root.left);
        if (root.left == null && root.right == null) result += root.data;
        sumOfLeafNodeHelper(root.right);
        if (root.left == null && root.right == null) result += root.data;
    }

    static int count = 0;

    static int getCount(Node root, int l, int h) {
        getCountHelper(root, l, h);
        return count;
    }

    private static void getCountHelper(Node root, int l, int h) {
        if (root == null) return;
        if (root.data >= l && root.data <= h) count++;
        getCountHelper(root.left, l, h);
        getCountHelper(root.right, l, h);
    }

    static int pairCount = 0;

    public static int countPairs() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(8);

        BinaryTree tree1 = new BinaryTree();
        tree1.root1 = new Node(10);
        tree1.root1.left = new Node(6);
        tree1.root1.right = new Node(15);
        tree1.root1.left.left = new Node(3);
        tree1.root1.left.right = new Node(8);
        tree1.root1.right.left = new Node(11);
        tree1.root1.right.right = new Node(18);
        countPairsUtil(root, root1, 16);

        return pairCount;
    }

    private static void countPairsUtil(Node root1, Node root2, int x) {
        if (root1 == null && root2 == null) return;
        else if (root1 == null) {
            if (root2.data == x) pairCount++;
        } else if (root2 == null) {
            if (root1.data == x) pairCount++;
        } else {
            if (root1.data + root2.data == x) pairCount++;
            countPairsUtil(root1.left, root2.left, x);
            countPairsUtil(root1.right, root2.right, x);
        }
    }

    private static int searchNode(Node root, int x) {
        int result = 0;
        searchNodeUtil(root, x, result);
        return result;
    }

    private static void searchNodeUtil(Node root, int x, int result) {
        if (root == null) return;
        if (root.data == x) result++;
        searchNodeUtil(root.left, x, result);
        searchNodeUtil(root.right, x, result);

    }

}
