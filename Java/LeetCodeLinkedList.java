public class LeetCodeLinkedList {
    public static void removeElements(ListNode head, int val) {

        if (head == null)
            return;

        ListNode n = head;
        ListNode temp;

        while (n.next != null) {
            if (n.next.val == val) {
                temp = n.next;
                n.next = temp.next;
            } else {
                n = n.next;
            }
        }
    }

    public static void addElements(ListNode head, int val) {

        ListNode node = new ListNode(val);

        if (head == null) {
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }
    public static ListNode reverseList(ListNode head){

        if(head == null || head.next == null)
            return head;

        ListNode current = head;
        ListNode previous = null;

        while (current != null){
            ListNode node = current.next;
            current.next = previous;
            previous = current;
            current = node;
        }

        return previous;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        addElements(head,2);
        addElements(head,3);
        addElements(head,4);

       // removeElements(head,4);
        head = reverseList(head);

        ListNode current = head;
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
}
