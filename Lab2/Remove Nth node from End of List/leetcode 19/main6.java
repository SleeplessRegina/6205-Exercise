package edu.northeastern.XuanyingWang;

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        for(int i = 0 ;i < n;i++){
            if(fast.next == null){
                break;
            }
            fast = fast.next;
            count++;
        }
        if(fast == head){
            return null;
        }

        if(fast.next == null){
            if(count < n){
                //Delete the nth to the last
                return head.next;
            }
            slow.next = slow.next.next;
            return head;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        if(n == 1){
            slow.next = null;
        }else {
            slow.next = slow.next.next;
        }
        return head;
    }
}

