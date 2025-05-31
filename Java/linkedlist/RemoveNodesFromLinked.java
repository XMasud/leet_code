package linkedlist;

import java.util.Stack;

public class RemoveNodesFromLinked {
    public ListNode removeNodes(ListNode head) {

        ListNode current = head;
        ListNode previous = null;

        while (current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
