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
        static int count = 0;
        static int counter = 0;
        static TreeNode prev = null;
        static TreeNode current = null;

        public BinaryTree() {
            root = null;
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new TreeNode(6);
            tree.root.left = new TreeNode(3);
            tree.root.right = new TreeNode(8);
            tree.root.left.left = new TreeNode(1);
            tree.root.left.right = new TreeNode(4);
            tree.root.right.left = new TreeNode(7);
            tree.root.right.right = new TreeNode(9);
//            System.out.println(modes(tree.root));
//            System.out.println(countNode(tree.root));
//            System.out.println(median(tree.root));

//            inOrderCount(tree.root);
//            System.out.println(count);
            System.out.println(medianOp(tree.root));
        }
        // 1,2,3,4,5

        static Map<Integer, Integer> map = new HashMap<>();

        private static int[] modes(TreeNode root) {
            util(root);
            List<Integer> result = new ArrayList<>();
            int max = Collections.max(map.values());
            for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                if (m.getValue() == max) result.add(m.getKey());
            }
            return result.stream().mapToInt(i -> i).toArray();
        }

        private static void util(TreeNode root) {
            if (root == null) return;
            map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            util(root.left);
            util(root.right);
        }

        private static int countNode(TreeNode root) {
            if (root == null) return 0;
            return countNode(root.left) + countNode(root.right) + 1;
        }

        private static int median(TreeNode node) {
            List<Integer> list = new ArrayList<>();
            inOrder(node, list);
            int n = list.size();
            if (n % 2 == 0) {
                return list.get((n / 2) - 1) + list.get((n / 2)) / 2;
            } else {
                return list.get((n / 2));
            }
        }

        private static int medianOp(TreeNode node) {
            inOrderCount(node);

            int k = count / 2;
            helper(node, k);
            if (count % 2 == 0) {
                return (prev.val + current.val) / 2;
            } else {
                return current.val;
            }
        }

        private static void helper(TreeNode node, int k) {
            if (node == null) return;
            helper(node.left, k);
            if (prev == null) {
                prev = node;
                counter++;
            } else if (counter == k) {
                counter++;
                current = node;
                return;
            } else {
                counter++;
                prev = node;
            }
            helper(node.right, k);
        }

        private static void inOrder(TreeNode node, List<Integer> list) {
            if (node == null) return;
            inOrder(node.left, list);
            list.add(node.val);
            inOrder(node.right, list);
        }

        private static void inOrderCount(TreeNode node) {
            if (node == null) return;
            inOrderCount(node.left);
            count++;
            inOrderCount(node.right);
        }

    }
}
