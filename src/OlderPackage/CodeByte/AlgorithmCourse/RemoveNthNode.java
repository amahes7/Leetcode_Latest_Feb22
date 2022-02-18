package OlderPackage.CodeByte.AlgorithmCourse;

public class RemoveNthNode {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head, start=head,end=head;
        for (int i=0;i<n-1;i++) current= current.next;
        start = current;
        while (current.next!=null){
            end=end.next;
            current = current.next;
        }

        int temp = start.val;
        start.val = end.val;
        end.val = temp;
        return head;



    }
}
