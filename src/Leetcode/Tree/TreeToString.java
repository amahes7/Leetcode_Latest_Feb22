package Leetcode.Tree;

public class TreeToString {
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

        static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new TreeNode(1);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree2String(tree.root);
        }

        public static void tree2String(TreeNode root) {
            System.out.println(preOrderTraversalUtil(root));
        }

        private static String preOrderTraversalUtil(TreeNode root) {
            if (root == null) return "";
            if (root.left == null && root.right == null) {
                return root.val + "";
            }
            if (root.right == null)
                return root.val + "(" + preOrderTraversalUtil(root.left) + ")";
            return root.val + "(" + preOrderTraversalUtil(root.left) + ")(" + preOrderTraversalUtil(root.right) + ")";
        }
    }
}


