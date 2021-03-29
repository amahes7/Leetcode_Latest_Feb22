package Leetcode.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class IncreasingOrderTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(){

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
            increasingBST(tree.root);
        }

        public static TreeNode increasingBST(TreeNode root) {
            List<Integer> resultList = new ArrayList<>();
            increasingBSTUtil(root, resultList);
            Collections.sort(resultList);
            TreeNode ans = new TreeNode(resultList.get(0)),cur=ans;
            for(int i=1;i<=resultList.size();i++){
                cur.right=new TreeNode(resultList.get(i));
                cur = cur.right;
            }
            return ans;
        }

        private static void increasingBSTUtil(TreeNode root, List<Integer> resultList) {
            if (root == null) return;
            increasingBSTUtil(root.left, resultList);
            resultList.add(root.val);
            increasingBSTUtil(root.right, resultList);
        }
    }


}

