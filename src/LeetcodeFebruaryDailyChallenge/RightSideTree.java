package LeetcodeFebruaryDailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class RightSideTree {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        function(root,result);
        System.out.println(result);
        return result;
    }

    private void function(TreeNode root, List<Integer> result) {
        if(root.right == null) {
            result.add(root.val);
            return;
        }
        result.add(root.val);
        function(root.right,result);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}