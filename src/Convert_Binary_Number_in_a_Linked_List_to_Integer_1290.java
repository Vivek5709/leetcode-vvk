public class Convert_Binary_Number_in_a_Linked_List_to_Integer_1290 {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        String binary = "";

        while (temp.next!=null){
            binary+=Integer.toString(temp.val);
            temp = temp.next;
        }

        int n = Integer.parseInt(binary,2);

        return n;
    }
}
