package Leetcode.Tree;

public class minimumValue {
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

        static int min = Integer.MAX_VALUE;

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new TreeNode(4);
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(5);
            tree.root.left.right = new TreeNode(15);
//            minimumValue(tree.root);
//            System.out.println(min);
            height(tree.root);
        }

        private static void height(TreeNode root) {
            int h = heightUtil(root);
            System.out.println(h);
        }

        private static int heightUtil(TreeNode root) {
            if (root == null) return 0;
            else {
                int lh = heightUtil(root.left);
                int rh = heightUtil(root.right);
                if (lh < rh) return rh + 1;
                else return lh + 1;
            }
        }

        public static void minimumValue(TreeNode root) {
            if (root == null) return;
            if (min > root.val) {
                min = root.val;
                minimumValue(root.left);
            } else if (min < root.val) {
                minimumValue(root.right);
            }
        }
    }


}
