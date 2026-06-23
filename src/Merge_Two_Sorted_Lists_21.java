public class Merge_Two_Sorted_Lists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp1=null;
        ListNode temp2 = null;
        ListNode node1 = null;
        ListNode node2 = null;

        if(list2.val>list1.val){
            head = list1;
            node1 = list2;
            node2 = list2.next;
        }else{
            head = list2;
            node1 = list1;
            node2 = list1.next;
        }

        temp1 = head;
        temp2 = temp1.next;
        while(temp1!=null){
            while(node1.val>temp2.val){
                temp1 = temp2;
                temp2 = temp2.next;
            }

            temp1.next = node1;
            node1.next = temp2;
            temp1 = temp1.next;

            node1 = node2;
            node2 = node2.next;

        }

        return head;
    }
}
