package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {


    static TreeNode root;

    public PreOrderTraversal() {
        root = null;
    }

    static class TreeNode {
        TreeNode left, right;
        int val;

        TreeNode(int data) {
            this.val = data;
            left = null;
            right = null;
        }

        public TreeNode() {

        }
    }


    public static List<Integer> preOrder() {
        List<Integer> result = new ArrayList<>();
        preOrderUtil(root, result);
        return result;
    }

    private static void preOrderUtil(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preOrderUtil(root.left, result);
        preOrderUtil(root.right, result);
    }

    public static void main(String[] args) {
        PreOrderTraversal tree = new PreOrderTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        preOrder();

    }

}
