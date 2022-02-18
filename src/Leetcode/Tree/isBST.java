package Leetcode.Tree;

public class isBST {

    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode() {
        }

        public TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }


    static class BinaryTree {

        TreeNode root;

        public BinaryTree() {
            root = null;
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(1);
            tree.root.right = new TreeNode(1);
            tree.root.left.left = new TreeNode(1);
            tree.root.left.right = new TreeNode(1);
            System.out.println(isBST(tree.root));
        }

        static boolean isBST(TreeNode root) {
            return isBSTUtil(root, Integer.MIN_VALUE,
                    Integer.MAX_VALUE);
        }

        static boolean isBSTUtil(TreeNode node, int min, int max) {
            /* an empty tree is BST */
            if (node == null)
                return true;

            /* false if this node violates the min/max constraints */
            if (node.val < min || node.val > max)
                return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
            // Allow only distinct values
            return (isBSTUtil(node.left, min, node.val - 1) &&
                    isBSTUtil(node.right, node.val + 1, max));
        }

    }



}
