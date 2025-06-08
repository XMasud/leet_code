package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList148 {
    public static ListNode sortList(ListNode head) {

        List<Integer> sortedList = new ArrayList<>();

        ListNode current = head;

        while (current != null){
            sortedList.add(current.val);
            current = current.next;
        }

        Collections.sort(sortedList);

        ListNode newList = new ListNode(Integer.MIN_VALUE);
        ListNode dummy = newList;

        for (int num: sortedList){
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }

        return newList.next;
    }
}
