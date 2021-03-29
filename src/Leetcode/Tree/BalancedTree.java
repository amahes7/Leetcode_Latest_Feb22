package Leetcode.Tree;

public class BalancedTree {
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
            System.out.println(balancedTree(tree.root));
        }

        static int lh = 1, rh = 1;

        private static boolean balancedTree(TreeNode root) {
            if (root == null) return true;
            leftUtil(root);
            rightUtil(root);
            if (Math.abs(lh - rh) == 1) return true;
            else return false;

        }

        private static void leftUtil(TreeNode root) {
            if (root == null) return;
            else {
                if (root.left != null || root.right != null) {
                    lh++;
                    leftUtil(root.left);
                }
            }

        }

        private static void rightUtil(TreeNode root) {
            if (root == null) return;
            else {
                if (root.left != null || root.right != null) {
                    rh++;
                    rightUtil(root.right);
                }
            }
        }

    }


}
