package Leetcode.Tree;

import java.util.HashSet;

public class UnivalTrees {

    static class TreeNode {
        int val;
        TreeNode left, right;

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
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(1);
            tree.root.left.right = new TreeNode(1);
            System.out.println(univalTree(tree.root));
        }

        public static boolean univalTree(TreeNode root) {
            if (root == null) return true;
            HashSet<Integer> set = new HashSet<>();
            univalTree(root, set);
            if (set.size() == 1) return true;
            else return false;
        }

        private static void univalTree(TreeNode root, HashSet<Integer> set) {
            if(root == null) return;
            if (!set.contains(root.val)) {
                set.add(root.val);
            }
            univalTree(root.left, set);
            univalTree(root.right, set);
        }
    }

}
