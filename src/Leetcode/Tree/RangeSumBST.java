package Leetcode.Tree;

public class RangeSumBST {


    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        public Node() {

        }
    }

    int result =0;
    public int rangeSumBST(Node root, int L, int R) {
        rangeSumBSTUtil(root,L,R);
        return result;
    }

    private void rangeSumBSTUtil(Node root, int L, int R) {
        if(root == null) return;
        if(root.data >=L && root.data <=R){
            result+=root.data;
        }
        rangeSumBSTUtil(root.left,L,R);
        rangeSumBSTUtil(root.right,L,R);
    }
}
