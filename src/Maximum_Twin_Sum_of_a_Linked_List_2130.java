import java.util.HashMap;

public class Maximum_Twin_Sum_of_a_Linked_List_2130 {
    int max_sum(ListNode head){
        int max =0;
        int len = 0;
        while(head.next!=null){
            len++;
            head = head.next;
        }

        int index=len/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            if(i<=index){
                map.put(i,head.val);
            }else{
                max = Math.max(max,(head.val+map.get(index)));
                index--;
            }
        }

        return max;
    }
}
