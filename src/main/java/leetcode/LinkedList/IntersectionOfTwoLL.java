package main.java.leetcode.LinkedList;

public class IntersectionOfTwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA != tempB){
            if(tempA == null){
                tempA = headB;
            }else{
                tempA = tempA.next;
            }

            if(tempB == null){
                tempB = headA;
            }else{
                tempB = tempB.next;
            }
        }
        return tempA;
    }
}
