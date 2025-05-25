package linkedlist;

import java.util.HashSet;

public class IntersectionOfTwoLinkedLists160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> nodeCollection = new HashSet<>();

        ListNode currentA = headA;
        ListNode currentB = headB;

        while (currentA != null){
            if(!nodeCollection.contains(currentA))
                nodeCollection.add(currentA);
            currentA = currentA.next;
        }

        while (currentB != null){
            if(nodeCollection.contains(currentB))
                return currentB;
            currentB = currentB.next;
        }
        return null;
    }
}
