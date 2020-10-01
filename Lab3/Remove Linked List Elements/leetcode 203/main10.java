/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class main10 {
        public ListNode removeElements(ListNode head, int val)
        {
            while(head!=null&&head.val==val)//Initialize
            {
                ListNode pre=head;
                head=pre.next;
                pre.next=null;
            }
            if(head==null)
            {
                return null;
            }
            ListNode pre=head;
            while(pre.next!=null)
            {
                ListNode cur=pre.next;
                if(cur.val==val)//remove node
                {
                    pre.next=cur.next;
                    cur.next=null;
                }
                else //pointer moves backwords
                {
                    pre=pre.next;
                }
            }
            return head;
        }
    }

