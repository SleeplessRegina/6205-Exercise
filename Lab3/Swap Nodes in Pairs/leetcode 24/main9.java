public class main9 {
        public main9 swapPairs(main9 head) {
            main9 list1=new main9(0);
            list1.next=head;
            main9 list2=list1;
            while(head!=null&&head.next!=null){
                list2.next=head.next;
                head.next=list2.next.next;
                list2.next.next=head;
                list2=list2.next.next;
                head=list2.next;
            }
            return list1.next;

        }
    }
}
