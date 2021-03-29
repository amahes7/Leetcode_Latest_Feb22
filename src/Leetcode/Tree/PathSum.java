package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
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
            tree.root.left = new TreeNode(1);
            tree.root.right = new TreeNode(1);
            tree.root.left.left = new TreeNode(1);
            tree.root.left.right = new TreeNode(1);
            pathSUm(tree.root);
            System.out.println("hi");
        }

        static List<Integer> list = new ArrayList<>();

        private static void pathSUm(TreeNode root) {
            util(root,0);

        }

        private static void util(TreeNode root,int sum) {
            if(root ==null) return;
            if(root.left == null && root.right == null){
                sum+= root.val;
                list.add(sum);
                sum=0;
                return;
            }
            sum+= root.val;
            util(root.left,sum);
            util(root.right,sum);
        }

    }


}
