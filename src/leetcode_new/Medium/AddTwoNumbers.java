package leetcode_new.Medium;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AddTwoNumbers {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        int num1 = 0;
        int num2 = 0;

        System.out.println();
        while (l1.next != null) {
            num1 = num1 * 10 + l1.val;
            l1 = l1.next;
        }
        while (l2.next != null) {
            num2 = num2 * 10 + l2.val;
            l2 = l2.next;
        }

        num1 = num1 + num2;
        while (num1 > 0) {
            dummyHead.next = new ListNode(num1 % 10);
            num1 /= 10;
        }
        return dummyHead;

    }
}
