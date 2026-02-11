package main.java.leetcode.LinkedList;

public class ReverseLL {
    // main function
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode nextNode;

        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }

        head = prev;
        return head;
    }
}
