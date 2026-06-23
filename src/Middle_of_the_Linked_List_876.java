public class Middle_of_the_Linked_List_876 {
    public ListNode middleNode(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;

        while(p2!=null && p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }

        if(p2==null){
            return p1.next;
        }else if(p2.next==null){
            return p1;
        }

        return null;
    }
}
