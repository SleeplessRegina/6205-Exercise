
    class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null)
            return head;
        //1.
        ListNode odd = head;
        //2.
        ListNode even = head.next;
        //3.
        ListNode evenStart = head.next;
        //4.
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        //5.
        odd.next = evenStart;
        //6.
        return head;
    }
}



