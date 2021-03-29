package Leetcode.Tree;

public class SearchInBinaryTree {

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

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if (root.val == val) return root;
//        if(val > root.val) return searchBST(root.right,val);
//        if(val < root.val) return searchBST(root.left,val);
//        return null;
        return val > root.val ?searchBST(root.right,val) : searchBST(root.left,val);
    }


}
