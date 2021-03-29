package Leetcode.AmazonEasy;


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


public class Merge2Lists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        if(l1 ==null && l2 == null) return result;
        if(l1== null) return l2;
        if(l2== null) return l1;
        while(l1 !=null){
            result.val=(l1.val);
            result.val=(l1.val);
        }
        return result;
    }
}
