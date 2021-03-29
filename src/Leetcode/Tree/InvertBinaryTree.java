package Leetcode.Tree;

public class InvertBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int item) {
            val = item;
            left = right = null;
        }

        public TreeNode() {
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
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
//            tree.root.left.left = new TreeNode(4);
//            tree.root.left.right = new TreeNode(5);
            invertTree(tree.root);
        }

        public static TreeNode invertTree(TreeNode root) {
            TreeNode ans = new TreeNode();
            if(root == null) return null;
            invertTreeUtil(root, ans);
            return ans;
        }

        private static void invertTreeUtil(TreeNode root, TreeNode ans) {
            ans.val = root.val;
            if (root.left != null) {
                ans.right = new TreeNode();
                invertTreeUtil(root.left, ans.right);
            }
            if (root.right != null) {
                ans.left = new TreeNode();
                invertTreeUtil(root.right, ans.left);
            }
        }
    }

}
