/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    boolean solution(ListNode head, List<Integer> list){
        ListNode slow = new ListNode();
        ListNode fast = new ListNode();

        slow = head;
        fast = head;

        while(fast != null && fast.next != null){
            list.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null && fast.next == null) slow = slow.next;

        int ind = list.size();
        while(slow != null){
            ind--;
            if(slow.val != list.get(ind)) return false;
            slow = slow.next;
        }

        return true;
    }

    public boolean isPalindrome(ListNode head) {
       return solution(head, new ArrayList<>());
    }
}