public class Remove_Nth_Node_From_End_of_List_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp2 = null;
        int len = 0;

        while(temp!=null){
            temp = temp.next;
            len++;
        }

        temp = head;
        len = len - (len-n);

        int i =0;
        while(i<len){
            temp2 = temp;
            temp = temp.next;
            i++;
        }

        temp2.next = temp.next;

        return head;
    }
}
