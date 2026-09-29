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
    public ListNode reverseList(ListNode head) {
        ListNode first = new ListNode();
        ListNode mid = new ListNode();
        ListNode last = new ListNode();

        if(head == null) return null;
        if(head.next == null) return head;
        if(head.next.next == null){
            first = head.next;
            first.next = head;
            head.next = null;

            return first;
        }

        first = head;
        mid = head.next;
        last = head.next.next;

        first.next = null;
        while(last != null){
            mid.next = first;

            first = mid;
            mid = last;
            last = last.next;
        }

        mid.next = first;

        return mid;
    }
}