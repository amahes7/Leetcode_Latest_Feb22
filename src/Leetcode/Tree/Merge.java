package Leetcode.Tree;

public class Merge {
    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode() {}

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
            TreeNode result =merge2Trees(tree.root,tree.root);
            System.out.println("hi");
        }

        private static TreeNode merge2Trees(TreeNode root, TreeNode root1) {
            if((root ==null) && (root1 ==null)) return null;
            if((root ==null) ) return root1;
            if((root1 ==null) ) return root;
            root.val += root1.val;
            root.left = merge2Trees(root.left,root1.left);
            root.right = merge2Trees(root.right,root1.right);
            return root;
        }

    }



}
