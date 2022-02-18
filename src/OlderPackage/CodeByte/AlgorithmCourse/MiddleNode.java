package OlderPackage.CodeByte.AlgorithmCourse;

public class MiddleNode {


    //    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode middleNode(ListNode head) {
        ListNode[] array = new ListNode[100];
        int counter = 0;
        while (head != null) {
            array[counter++] = head;
            head = head.next;
        }
        return array[counter / 2];
    }

    public ListNode middleNode1(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
