package edu.northeastern.XuanyingWang;

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less_head = new ListNode();
        ListNode more_head = new ListNode();
        ListNode less_ptr = less_head;
        ListNode more_ptr = more_head;
        while(head != null){
            if(head.val < x){
                less_ptr.next = head;
                less_ptr = head;
            }else{
                more_ptr.next = head;
                more_ptr = head;
            }
            head = head.next;
        }
        less_ptr.next = more_head.next;
        more_ptr.next = null;
        return less_head.next;
    }
}

