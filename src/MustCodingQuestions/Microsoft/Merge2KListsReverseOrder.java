package MustCodingQuestions.Microsoft;

public class Merge2KListsReverseOrder {


    static Node head1 = null;
    static Node head = null;

    static void insert_back(int value) {

        // we have used insertion at back method
        // to enter values in the list.(eg:
        // head.1.2.3.4.Null)
        Node temp = new Node();
        temp.value = value;
        temp.next = null;

        // If *head equals to null
        if (head == null) {
            head = temp;
            return;
        } else {
            Node last_node = head;
            while (last_node.next != null) {
                last_node = last_node.next;
            }
            last_node.next = temp;
            return;
        }
    }

    static void insert_back_1(int value) {

        // we have used insertion at back method
        // to enter values in the list.(eg:
        // head.1.2.3.4.Null)
        Node temp = new Node();
        temp.value = value;
        temp.next = null;

        // If *head equals to null
        if (head1 == null) {
            head1 = temp;
            return;
        } else {
            Node last_node = head1;
            while (last_node.next != null) {
                last_node = last_node.next;
            }
            last_node.next = temp;
            return;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        insert_back(10);
        insert_back(20);
        insert_back(30);
        insert_back(40);

        insert_back_1(5);
        insert_back_1(25);
        insert_back_1(35);
        insert_back_1(45);

        mergeResult(head1, head);
    }

    private static Node mergeResult(Node node1, Node node2) {
        int num = 0;
        if (node1 == null && node2 == null) return null;
        else if (node1 == null || node2 == null) return (node1 == null) ? node2 : node1;
        if (node1.value < node2.value) {
            num = node1.value;
            node1 = node1.next;
        } else {
            num = node2.value;
            node2 = node2.next;
        }
        Node result = new Node(num);
        result.next = mergeResult(node1, node2);
        return result;
    }

    static class Node {
        int value;
        Node next;

        Node() {
        }

        Node(int value) {
            this.value = value;
        }
    }
}
