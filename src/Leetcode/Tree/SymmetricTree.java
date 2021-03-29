package Leetcode.Tree;

public class SymmetricTree {
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
            System.out.println(isSymmetric(tree.root));
        }

        public static boolean isSymmetric(TreeNode root) {
            return isSymmetricUtil(root, root);
        }

        private static boolean isSymmetricUtil(TreeNode root1, TreeNode root2) {

            if (root1 == null && root2 == null) return true;
            if (root1 == null || root2 == null) return false;
            return (root1.val == root2.val) && isSymmetricUtil(root1.left, root2.right) && isSymmetricUtil(root1.right, root2.left);
        }

    }


}
