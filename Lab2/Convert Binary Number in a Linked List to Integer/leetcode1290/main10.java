package edu.northeastern.XuanyingWang;

class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int ans = 0;
        while (cur != null) {
            ans <<= 1;
            ans += cur.val;
            cur = cur.next;
        }
        return ans;
    }
}

