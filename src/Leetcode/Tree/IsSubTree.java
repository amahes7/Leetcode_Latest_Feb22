package Leetcode.Tree;

public class IsSubTree {

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
            tree.root = new TreeNode(3);
            tree.root.left = new TreeNode(4);
            tree.root.right = new TreeNode(5);
            tree.root.left.left = new TreeNode(1);
            tree.root.left.right = new TreeNode(2);
            BinaryTree tree1 = new BinaryTree();
            tree1.root = new TreeNode(4);
            tree1.root.left = new TreeNode(1);
            tree1.root.right = new TreeNode(5);
            System.out.println(isSubTree(tree.root, tree1.root));
        }

        static boolean status = true;

        private static boolean isSubTree(TreeNode s, TreeNode t) {
            if (s == null && t == null) return true;
            if (s == null || t == null) return false;
            String sString = util(s, new StringBuilder());
            String tString = util(t, new StringBuilder());
            return status;
        }

        private static String util(TreeNode root, StringBuilder sb) {
            if (root == null) return sb.toString();
            util(root.left, sb);
            util(root.right, sb);
            sb.append(root.val);
            return sb.toString();
        }
    }


}
