package OlderPackage.Revision;

class Node {
    int data = Integer.MIN_VALUE;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Tree {

    Node root;
    Node root2;

    public static void main(String args[]) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(8);
        tree.root.right.right = new Node(0);
        tree.root.left.right = new Node(5);


        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.left.left = new Node(8);
        tree.root2.right.right = new Node(0);
        tree.root2.left.right = new Node(9);

//        System.out.println(height(tree.root));
//        printLevelOrder(tree.root);
//        System.out.println(leftmost(tree.root).data);
//        System.out.println(rightmost(tree.root).data);
//        System.out.println(isSame(tree.root, tree.root2));
        rangeSumBST(tree.root, 0, 5);
        System.out.println(sum);
    }

    public static int height(Node root) {
        if (root == null) return 0;
        else {
            int lh = height(root.left);
            int rh = height(root.right);
            if (lh > rh) return lh + 1;
            else return rh + 1;
        }
    }

    public static void printGivenLevel(Node root, int level) {
        if (root == null) return;
        else if (level == 1) System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    public static void printLevelOrder(Node root) {
        int h = height(root);
        for (int i = 0; i <= h; i++) {
            printGivenLevel(root, i);
            System.out.println("");
        }
    }

    public static Node leftmost(Node root) {
        if (root.left == null) return root;
        else return leftmost(root.left);
    }

    public static Node rightmost(Node root) {
        if (root.right == null) return root;
        else return rightmost(root.right);
    }

    public static boolean isSame(Node p, Node q) {
        return isSameHelper(p, q);
    }

    private static boolean isSameHelper(Node p, Node q) {
        if (p == null && q == null) return true;
        else if (p == null || q == null) return false;
        else {
            if (p.data != q.data || !isSameHelper(p.left, q.left) || !isSameHelper(p.right, q.right)) return false;
        }
        return true;
    }


    public boolean isSymmetric(Node root) {
        if (root == null || (root.left == null && root.right == null)) return true;
        else {
            Node left = root.left;
            Node right = root.right;
            return isSymmetricUtil(left, right);
        }

    }

    private boolean isSymmetricUtil(Node left, Node right) {
        if (left == null && right == null) return true;
        else if (left == null || right == null) return false;
        else return isSymmetricUtil(left.left, right.right) && isSymmetricUtil(left.right, right.left);
    }

    static int sum;

    public static int rangeSumBST(Node root, int low, int high) {
        sum = 0;
        rangeSumBSTUtil(root, low, high);
        return sum;
    }

    private static void rangeSumBSTUtil(Node root, int low, int high) {
        if (root == null) return;
        else if (root.data >= low && root.data <= high) sum += root.data;
        rangeSumBSTUtil(root.left, low, high);
        rangeSumBSTUtil(root.right, low, high);

    }

    static int diameter;

    public static int diameterOfBinaryTree(Node root) {
        diameter = 0;
        diameterOfBinaryTreeUtil(root);
        return diameter;
    }

    private static int diameterOfBinaryTreeUtil(Node root) {
        if (root == null) return 0;
        int left = diameterOfBinaryTreeUtil(root.left);
        int right = diameterOfBinaryTreeUtil(root.right);

        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }


    public Node invertTree(Node root) {
        if (root == null) return root;
        else{
            Node left = invertTree(root.left);
            Node right = invertTree(root.right);
            root.left = right;
            root.right = left;
            return root;
        }

    }
}
