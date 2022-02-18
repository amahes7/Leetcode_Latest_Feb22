package OlderPackage.CodeByte.AlgorithmCourse;


public class MergeTrees {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode root;
        TreeNode root1;
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


    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode();
        treeNode.root = new TreeNode(1);
        treeNode.root.left = new TreeNode(3);
        treeNode.root.right = new TreeNode(2);
        treeNode.root.left.left = new TreeNode(5);

        TreeNode treeNode1 = new TreeNode();
        treeNode1.root1 = new TreeNode(2);
        treeNode1.root1.left = new TreeNode(1);
        treeNode1.root1.right = new TreeNode(3);
        treeNode1.root1.left.right = new TreeNode(4);
        treeNode1.root1.right.right = new TreeNode(7);


        mergeTrees(treeNode.root, treeNode1.root1);
    }


    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

}
