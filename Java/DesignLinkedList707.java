public class DesignLinkedList707 {
    private ListNode head;
    private int size;

    public DesignLinkedList707() {
       head = new ListNode(0);
       size = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= size)
            return -1;

        ListNode current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.next.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if ((index < 0) || (index > size)) {
            return;
        }

        ListNode current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = current.next;
        current.next = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {
        if ((index < 0) || (index >= size)) {
            return;
        }

        ListNode current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        size--;
        current.next = current.next.next;
    }
}
