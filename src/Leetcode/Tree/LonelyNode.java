package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left, right;

    public Node(int item) {
        val = item;
        left = right = null;
    }
}


public class LonelyNode {
    List<Integer> result = new ArrayList<>();
    public List<Integer> getLonelyNodes(Node root) {
        if (root == null) return result;
        if (root.left == null && root.right != null) {
            result.add(root.right.val);
        }
        if (root.right == null && root.left != null) {
            result.add(root.left.val);
        }
        if (root.left != null)
            getLonelyNodes(root.left);
        if (root.right != null)
            getLonelyNodes(root.right);
        return result;
    }
}
