

class Node {
    int data = Integer.MIN_VALUE;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {


    static Node root;

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(6);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);
        tree.root.right.right = new Node(23);
        System.out.println("Tree traversal: ");
        printLevelOrder();

        System.out.println("\nPrint level 1 of Tree: ");
        printGivenLevel(root,1);

        System.out.println("\nPrint level 2 of Tree: ");
        printGivenLevel(root,2);

        System.out.println("\nPrint level 3 of Tree: ");
        printGivenLevel(root,3);
    }

    private static void printLevelOrder() {
        int h = height(root);
        for (int i = 1; i <= h; i++) printGivenLevel(root, i);
    }

    private static void printGivenLevel(Node root, int level) {
        if(root ==null) return;
        if(level ==1) System.out.print(root.data + " ");
        else if(level >1){
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }

    private static int height(Node root) {
        if (root == null) return 0;
        else {
            int lh = height(root.left);
            int rh = height(root.right);
            if (lh > rh) return lh + 1;
            else return rh + 1;
        }
    }
}
