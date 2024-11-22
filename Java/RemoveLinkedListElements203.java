
public class RemoveLinkedListElements203 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;

        ListNode result = head;
        while(result != null && result.val == val){
            result = result.next;
        }

        if (result == null) {
            return null;
        }

        ListNode n = result;
        ListNode temp;

        while(n.next != null){
            if(n.next.val == val){
                temp = n.next;
                n.next = temp.next;
            }else{
                n = n.next;
            }
        }

        return result;
    }
}
