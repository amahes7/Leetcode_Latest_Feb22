package Leetcode.Tree;


import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

    static TreeNode root;
    public PostOrderTraversal(){
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


    public static List<Integer> postorder() {
        List<Integer> result = new ArrayList<>();
        postOrderUtil(root, result);
        return result;
    }

    private static void postOrderUtil(TreeNode root, List<Integer> result) {
        if(root == null) return;
        postOrderUtil(root.left, result);
        postOrderUtil(root.right, result);
        result.add(root.val);
    }

    public static void main(String[] args) {
        PostOrderTraversal tree = new PostOrderTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        postorder();

    }

}
