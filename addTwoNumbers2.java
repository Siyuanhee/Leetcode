public class addTwoNumbers2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode current = head;

        while(l1 != null || l2 != null){
            int num1;
            int num2;

            if(l1 == null){
                num1 = 0;
            }else{
                num1 = l1.val;
            }

            if(l2 == null){
                num2 = 0;
            }else{
                num2 = l2.val;
            }

            int sum = carry + num1 + num2;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry == 1){
            current.next = new ListNode(1);
        }

        return head.next;
    }

}
