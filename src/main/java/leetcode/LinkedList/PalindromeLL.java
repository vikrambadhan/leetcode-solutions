package main.java.leetcode.LinkedList;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromeLL {
    // Solution using Array List
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();

        while(head != null){
            values.add(head.val);
            head = head.next;
        }
        int i = 0;
        int j = values.size() - 1;
        while(i < j){
            if(values.get(i) != values.get(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    // Solution Using Stacks
    public boolean isPalindrome1(ListNode head) {
        ListNode curr = head;
        Stack<Integer> s1 = new Stack<>();

        while(curr != null){
            s1.push(curr.val);
            curr = curr.next;
        }

        curr = head;

        while(curr != null){
            int top = s1.pop();

            if(curr.val != top){
                return false;
            }
            curr = curr.next;

        }
        return true;
    }

    // using two pointers
    public boolean isPalindrome2(ListNode head) {
        // find middle
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast = fast.next;
        }
        // rev second half
        ListNode prev = null, curr = slow;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //compare the two
        while(prev != null){
            if(prev.val != head.val) return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}
