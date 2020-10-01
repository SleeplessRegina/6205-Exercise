

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class main3 {

    class Solution {
        // Move the next node of this node forward
        public void deleteNode(ListNode node) {
            //Pass the value of the next node to the current node
            node.val = node.next.val;
            //following step is equivalent to deleting the next node
            node.next = node.next.next;
        }
    }


}
