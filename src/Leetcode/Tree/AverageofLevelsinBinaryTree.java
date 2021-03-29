package Leetcode.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageofLevelsinBinaryTree {
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
            averageOfLevels(tree.root);
        }


        public static List<Double> averageOfLevels(TreeNode root) {
            int height = height(root);
            List<Double> resultList = new ArrayList<>();
            for (int i = 1; i <= height; i++) {
                List<Integer> numList = new ArrayList<>();
                getAverageOfLevel(root, i, numList);
                int sum = numList.stream().reduce(0, Integer::sum);
                resultList.add((double) sum / numList.size());
            }
            return resultList;
        }

        private static void getAverageOfLevel(TreeNode root, int level, List<Integer> numList) {
            if (root == null) return;
            if (level == 1) {
                numList.add(root.val);
            }
            if (level > 1) {
                getAverageOfLevel(root.left, level - 1, numList);
                getAverageOfLevel(root.right, level - 1, numList);
            }
        }

        private static int height(TreeNode root) {
            if (root == null) return 0;
            else {
                int lh = height(root.left);
                int rh = height(root.right);
                if (lh > rh) return lh + 1;
                else return rh + 1;
            }
        }
    }

}
