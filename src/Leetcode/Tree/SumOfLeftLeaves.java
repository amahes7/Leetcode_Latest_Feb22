package Leetcode.Tree;

public class SumOfLeftLeaves {
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

        static int sum = 0;

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new TreeNode(1);
//            tree.root.left = new TreeNode(2);
//            tree.root.right = new TreeNode(1);
//            tree.root.right.left = new TreeNode(3);
//            tree.root.right.right = new TreeNode(4);
            sumofleft(tree.root, false);
            System.out.println(sum);
        }

        private static void sumofleft(TreeNode root, boolean isLeft) {
            if (root == null) return;
            if (root.right == null && root.left == null && isLeft) {
                sum += root.val;
            }
            sumofleft(root.left, true);
            sumofleft(root.right, false);

        }

    }


}
