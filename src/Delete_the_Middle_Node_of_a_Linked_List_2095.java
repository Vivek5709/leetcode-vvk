public class Delete_the_Middle_Node_of_a_Linked_List_2095 {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        ListNode p1 = head;
        ListNode p2 = head;

        while(p2.next!=null && p2!=null){
            temp = p1;
            p1 = p1.next;
            p2 = p2.next.next;
        }

        temp.next = p1.next;

        return head;
    }
}
