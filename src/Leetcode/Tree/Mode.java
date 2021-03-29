package Leetcode.Tree;

import java.util.*;

public class Mode {
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
            tree.root.left.left = new TreeNode(3);
            tree.root.left.right = new TreeNode(3);
            System.out.println(modes(tree.root));
        }

        static Map<Integer, Integer> map = new HashMap<>();

        private static int[] modes(TreeNode root) {
            util(root);
            List<Integer> result = new ArrayList<>();
            int max = Collections.max(map.values());
            for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                if (m.getValue() == max) result.add(m.getKey());
            }
            int[] r = new int[result.size()];
            int i = 0;
            for (int a : result) {
                r[i] = a;
                i++;
            }
            return r;
        }

        private static void util(TreeNode root) {
            if (root == null) return;
            map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            util(root.left);
            util(root.right);
        }

    }
}
