package MustCodingQuestions.Microsoft;

public class RemoveKthNode {

    static Node delete(Node head, int k) {
        // Your code here
        if(k ==1) return null;
        if(head == null) return  null;
        int count =0;
        Node ptr = head, prev = null;
        while (ptr != null)
        {
            // increment Node count
            count++;

            // check if count is equal to k
            // if yes, then delete current Node
            if (k == count)
            {
                // put the next of current Node in
                // the next of previous Node
                prev.next = ptr.next;

                // set count = 0 to reach further
                // k-th Node
                count = 0;
            }

            // update prev if count is not 0
            if (count != 0)
                prev = ptr;

            ptr = prev.next;
        }
        return head;
    }


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

    // Driver Code
    public static void main(String[] args) {
        insert_back(1);
        insert_back(2);
        insert_back(3);
        insert_back(4);
        delete(head, 3);
    }

    static class Node {
        int value;
        Node next;

//        Node(int value) {
//            this.value = value;
//        }
    }
}
