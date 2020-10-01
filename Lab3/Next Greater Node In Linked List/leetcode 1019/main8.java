public class main8 {
        public int[] nextLargerNodes(ListNode head) {
            List<Integer> res = new ArrayList<>();

            Stack<Integer> stack = new Stack<>();

            List<Integer> data = new ArrayList<>();

            int index=0;

            while(head!=null){
                res.add(0);

                data.add(head.val);

                while(!stack.isEmpty()&&head.val>data.get(stack.peek())){
                    res.set(stack.pop(),head.val);

                }

                stack.push(index);

                index++;

                head = head.next;

            }

            int arr[] = new int[res.size()];

            for(int i=0;i<arr.length;i++){
                arr[i] = res.get(i);

            }

            return arr;

        }

    }

