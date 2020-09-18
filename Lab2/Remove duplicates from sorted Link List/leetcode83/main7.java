package edu.northeastern.XuanyingWang;


  public class ListNode {
      int val;
     ListNode next;
     ListNode(int x) { val = x; }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        while (pre != null && pre.next != null) {
            if (pre.val == pre.next.val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }
}



