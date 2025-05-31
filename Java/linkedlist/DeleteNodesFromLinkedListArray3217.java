package linkedlist;

import java.util.HashSet;

public class DeleteNodesFromLinkedListArray3217 {

    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> result = new HashSet<>();
        for (int num: nums){
            result.add(num);
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode current = dummyNode;

        while (current.next != null){
            if(result.contains(current.next.val)){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return dummyNode.next;
    }
}
