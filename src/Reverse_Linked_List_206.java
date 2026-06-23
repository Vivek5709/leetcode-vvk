import java.util.ArrayList;
import java.util.List;

public class Reverse_Linked_List_206 {
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }

        int p1 = list.size()-1;
        temp =head;
        while(temp!=null){
            temp.val = list.get(p1);
            p1--;
            temp =temp.next;
        }

        return head;
    }

    }
