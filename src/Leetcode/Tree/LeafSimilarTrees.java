package Leetcode.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeafSimilarTrees {
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
            tree.root.left = new TreeNode(2);
            tree.root.right = new TreeNode(3);
            tree.root.left.left = new TreeNode(4);
            tree.root.left.right = new TreeNode(5);
            System.out.println(leafSimilarTrees(tree.root, tree.root));
        }

        private static boolean leafSimilarTrees(TreeNode root1, TreeNode root2) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            getLeaves(root1, list1);
            getLeaves(root2, list2);
            Collections.sort(list1);
            Collections.sort(list2);
            if (list1.equals(list2)) {
                return true;
            } else return false;
        }

        private static void getLeaves(TreeNode root, List<Integer> list) {
            if (root == null) return;
            if (root.left == null && root.right == null) {
                list.add(root.val);
            }
            getLeaves(root.left, list);
            getLeaves(root.right, list);

        }
    }
}
