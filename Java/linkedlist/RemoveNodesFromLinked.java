package linkedlist;

import java.util.Stack;

public class RemoveNodesFromLinked {
    public ListNode removeNodes(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while (current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        int max = Integer.MIN_VALUE;
        ListNode dummy = new ListNode(0);
        ListNode newCurrent = dummy;
        current = previous;

        while (current != null){
            if(current.val >= max){
                max = current.val;
                newCurrent.next = new ListNode(current.val);
                newCurrent = newCurrent.next;
            }
            current = current.next;
        }

        ListNode pre = null;
        ListNode curr = dummy.next;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }
}
