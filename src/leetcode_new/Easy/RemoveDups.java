package leetcode_new.Easy;


class ListNode {
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

public class RemoveDups {

    ListNode head;
    ListNode result = new ListNode();

    public ListNode deleteDuplicates() {
        if (head.val != head.next.val) result = new ListNode(head.val, result);
        return result;
    }
}
