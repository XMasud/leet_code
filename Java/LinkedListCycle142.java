import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle142 {
    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode current = head;

        while (current != null) {
            if (set.contains(current)) {
               return current;
            }
            set.add(current);
            current = current.next;
        }

        return null;
    }
}
