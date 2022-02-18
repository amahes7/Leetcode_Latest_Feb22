package MustCodingQuestions.Microsoft;

import java.util.Stack;

public class ReverseLinkedList {
    static class Node {
        int value;
        Node next;

//        Node(int value) {
//            this.value = value;
//        }
    }

    static Node reverseList(Node head) {
        if (head == null) return head;
        Stack<Node> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        Node res = stack.pop();
        Node tail = res;
        while (!stack.isEmpty()) {
            tail.next = stack.pop();
            tail = tail.next;
        }
        tail.next = null;
        return res;
    }
    static Node head = null;

    static void insert_back( int value)
    {

        // we have used insertion at back method
        // to enter values in the list.(eg:
        // head.1.2.3.4.Null)
        Node temp = new Node();
        temp.value = value;
        temp.next = null;

        // If *head equals to null
        if (head == null)
        {
            head = temp;
            return;
        }
        else
        {
            Node last_node = head;
            while (last_node.next != null)
            {
                last_node = last_node.next;
            }
            last_node.next = temp;
            return;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        insert_back( 1);
        insert_back( 2);
        insert_back(3);
        insert_back( 4);
        reverseList(head);
    }


}
