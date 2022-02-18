package LinkedList;

public class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    public Node swapNodes(Node head, int k) {
        Node current = head, start = head, end = head;
        for (int i = 0; i < k - 1; i++) current = current.next;
        start = current;
        while (current.next != null) {
            end = end.next;
            current = current.next;
        }

        int temp = start.data;
        start.data = end.data;
        end.data = temp;
        return head;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }


    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(7);
        llist.push(9);
        llist.push(6);
        llist.push(6);
        llist.push(7);
        llist.push(8);
        llist.push(3);
        llist.push(0);
        llist.push(9);
        llist.push(5);

        System.out.println("\nCreated Linked list is:");
        llist.printList();

        llist.swapNodes(llist.head, 3); // Delete node with data 1

        System.out.println(
                "\nLinked List after Deletion of 1:");
        llist.printList();
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
}
