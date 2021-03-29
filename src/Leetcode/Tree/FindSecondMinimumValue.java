package Leetcode.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondMinimumValue {
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
            System.out.println(findSecondMinimumValue(tree.root));
        }

        static Set<Integer> set1 = new HashSet<>();


        public static int findSecondMinimumValue(TreeNode root) {
            util(root);
            return (int)set1.toArray()[1];
        }

        private static void util(TreeNode root) {
            if(root == null)return;
            set1.add(root.val);
            util(root.left);
            util(root.right);

        }
    }


}
