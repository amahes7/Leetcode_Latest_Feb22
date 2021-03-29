package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeaf {

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
//            tree.root.left = new TreeNode(1);
            tree.root.right = new TreeNode(1);
//            tree.root.left.left = new TreeNode(0);
//            tree.root.left.right = new TreeNode(1);
//            tree.root.right.left = new TreeNode(0);
//            tree.root.right.right = new TreeNode(1);
            System.out.println(sumRootToLeaf(tree.root));
        }
        public static int sumRootToLeaf(TreeNode root) {
            return traverse(root, 0);
        }

        private static int traverse(TreeNode n, int val) {
            if (n == null) return 0;
            if (n.left == null && n.right == null) return (val * 2 + n.val);

            int curr = (val * 2 + n.val);
            int sum = traverse(n.left, curr) + traverse(n.right, curr);

            return sum ;
        }
    }
}
