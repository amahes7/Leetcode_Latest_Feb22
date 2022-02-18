package BFSTree;// Recursive Java program for level order traversal of Binary Tree

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* Class containing left and right child of current
node and key value*/
class Node {
    int data = Integer.MIN_VALUE;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    // Root of the Binary Tree
    Node root;
    static int max_sum = 0;

    public BinaryTree() {
        root = null;
    }

    /* function to print level order traversal of tree*/
    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    public List<Integer> rightSideView(Node root) {
        List<Integer> result = new ArrayList<>();
        function(root, result);
        System.out.println(result);
        return result;
    }

    private void function(Node root, List<Integer> result) {
        if (root.right == null) {
            result.add(root.data);
            return;
        }
        result.add(root.data);
        function(root.right, result);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root) {
        if (root == null)
            return 0;
        else {
            /* compute height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else return (rheight + 1);
        }
    }

    /* Print nodes at the given level */
    void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(8);
        tree.root.right.right = new Node(0);
        tree.root.left.right = new Node(5);


        System.out.println(childrenSum(tree.root, 8).data);
        //to print all the levels of tree
//        System.out.println("Level order traversal of binary tree is ");
//        tree.printLevelOrder();
//        tree.rightSideView(root);

        // to print level 1 of Tree
//        System.out.println("print level 1");
//        tree.printGivenLevel(tree.root, 1);


        // to print level 2 of Tree
//        System.out.println("print level 2");
//        tree.printGivenLevel(tree.root, 2);

        // to ge the height of a tree
//        System.out.println("height of a tree: "+tree.height(tree.root));

        // to get the level of an element
//        System.out.println("Level of an Element: "+ tree.getElementLevel(tree.root,1));
        // to get the leftmost element of the tree
//        System.out.println("Leftmost element: " + tree.leftmost(tree.root).data);
//         to get the rightmost element
//        System.out.println("Leftmost element: " + tree.rightmost(tree.root).data);

//         maxPathSum
//        System.out.println(maxPathSum(tree.root));

        // ByQueue
//        tree.printLevelOrderQueue();

        //size of a tree
//        tree.size();
    }

    private void size() {
        System.out.println(size(root));
    }

    private int size(Node root) {
        if (root == null) return 0;
        return size(root.left) + size(root.right) + 1;
    }

    private static int maxPathSum(Node root) {
        maxGain(root);
        return max_sum;
    }

    private static int maxGain(Node root) {
        if (root == null) return 0;
        int left_gain = Math.max(maxGain(root.left), 0);
        int right_gain = Math.max(maxGain(root.right), 0);
        int new_price = root.data + left_gain + right_gain;
        max_sum = Math.max(new_price, max_sum);
        return root.data + Math.max(left_gain, right_gain);
    }

    private Node rightmost(Node root) {
        if (root.right == null) return root;
        return rightmost(root.right);
    }

    private Node leftmost(Node root) {
        if (root.left == null) {
            return root;
        }
        return leftmost(root.left);
    }

    private int getElementLevel(Node root, int element) {
        return getElementLevelUtil(root, element, 1);

    }

    private int getElementLevelUtil(Node root, int element, int level) {
        if (root == null) return 0;
        if (root.data == element) return level;
        int result = getElementLevelUtil(root.left, element, level + 1);
        if (result != 0) return result;
        result = getElementLevelUtil(root.right, element, level + 1);
        return result;

    }

    private void printLevelOrderQueue() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

			/* poll() removes the present head.
			For more information on poll() visit
			http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    private static Node childrenSum(Node root, int target) {
        if (root == null) return root;
        if (root.left != null && root.right != null) {
            if (root.left.data + root.right.data == target) return root;
            else {
                Node temp = childrenSum(root.left, target);
                if (temp != null) return temp;
                else return childrenSum(root.right, target);
            }

        }
        return null;
    }
}
