import java.util.HashSet;

public class ListNode83 {
    int val;
    ListNode83 next;

    ListNode83(int data){
        this.val = val;
        this.next=null;
    }

    public ListNode83 deleteDuplicates(ListNode83 head) {
        ListNode83 curr = head;
        ListNode83 prev = null;

        HashSet<Integer> set = new HashSet<>();
        while(curr.next!=null){
            if(set.contains(curr.val)){
                prev.next = curr.next;
            }
            set.add(curr.val);
            prev = curr;
            curr = curr.next;
        }
        return curr;
    }
    public static void main(String[] args){

    }
}
