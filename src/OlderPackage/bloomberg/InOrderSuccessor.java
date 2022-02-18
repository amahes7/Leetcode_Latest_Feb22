package OlderPackage.bloomberg;


class Node {
    int data = Integer.MIN_VALUE;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class InOrderSuccessor {

    static Node root;

    public static void main(String args[]) {
        InOrderSuccessor tree = new InOrderSuccessor();
        tree.root = new Node(1);
        tree.root.left = new Node(6);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.right = new Node(23);
    }

    Node inOrderSuccessor(Node root, Node input) {
        if (input.right != null) {
            return findMin(input.right);
        } else {
            Node temp = root;
            Node result = null;
            while (temp != null) {
                if (temp.data > input.data) {
                    result = temp;
                    temp = temp.left;
                } else if (temp.data < input.data) temp = temp.right;
                else break;
            }
            return result;
        }
    }

    private Node findMin(Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }
}
