package Leetcode.Tree;

public class MinDepth {
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
            tree.root.left.left = new TreeNode(1);
            tree.root.left.right = new TreeNode(1);
            System.out.println(minimumDepth(tree.root));
        }

        private static int minimumDepth(TreeNode root) {
            if (root == null) return 0;
            if ((root.left == null) && (root.right == null)) return 1;
            int min = Integer.MAX_VALUE;
            if (root.left != null) {
                min = Math.min(min, minimumDepth(root.left));
            }
            if (root.right != null) {
                min = Math.min(min, minimumDepth(root.right));
            }
            return min + 1;
        }

    }


}
