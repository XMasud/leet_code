package linkedlist;

public class RemoveNthNode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode current = head;
        int size = 0;

        while(current != null){
            current = current.next;
            size++;
        }

        if(size - n == 0) return head.next;

        current = head;
        for(int i=1; i < size - n; i++){
            current = current.next;
        }
        current.next = current.next.next;


        return head;
    }
}
