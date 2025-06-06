package linkedlist;

public class PalindromeLinkedList234 {
    public static boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverseLinkedList(slow);
        fast = head;

        while (slow != null){

            if(fast.val != slow.val)
                return false;

            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
