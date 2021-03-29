package Leetcode.Tree;

public class TrimTree {

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
            tree.root.left = new TreeNode(0);
            tree.root.right = new TreeNode(2);
            tree.root.left.left = new TreeNode(6);
            tree.root.left.right = new TreeNode(5);
            System.out.println(trimBST(tree.root, 1, 2));
        }


        public static TreeNode trimBST(TreeNode root, int low, int high) {
            return trimBSTUtil(root, low, high);
        }

        private static TreeNode trimBSTUtil(TreeNode root, int low, int high) {
            if (root == null) return null;
            if (root.val < low) {
                root = root.right;
            }
            if (root.val > high) {
                root = root.left;
            }
            if (root != null) {
                root.left = trimBSTUtil(root.left, low, high);
                root.right = trimBSTUtil(root.right, low, high);
            }
            return root;

        }
    }
}
