package linkedlist;

import java.util.*;

public class DesignLinkedList {

    public static ListNode addAtIndex(ListNode head, int index, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        for (int i = 0; i < index; i++) {
            if (current == null) return head;
            current = current.next;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = current.next;
        current.next = newNode;

        return dummy.next;
    }

    public static ListNode deleteAtIndex(ListNode head, int index) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        for (int i = 0; i < index; i++) {
            if (current.next == null) return head;
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return dummy.next;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode arrayToList(int[] arr) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static ListNode removeNodes(ListNode head) {

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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode head = dummy;

        while (list1 != null && list2 != null){

            if(list1.val <= list2.val){
                dummy.next = list1;
                list1 = list1.next;
            }else {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }

        if(list1 == null){
            dummy.next = list2;
        } else if (list2 == null) {
            dummy.next = list1;
        }

        return head.next;
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode current = head;
        ListNode previous = null;

        while (current != null){

            if(current.val >= left && current.val <= right){
                ListNode next = current.next;
                current = next;
            }

            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {

        ListNode head1 = arrayToList(new int[]{4,2,1,3});
        System.out.print("Original list: ");
        printList(head1);

        /*ListNode head2 = arrayToList(new int[]{4,7,9});
        System.out.print("Second list: ");
        printList(head2);*/


        //head1 = sortList(head1);
        //System.out.print("Modified list: ");
        //printList(head1);

        //head = removeNodes(head);
        //System.out.print("Removed list: ");
        //printList(head);

    }
}
