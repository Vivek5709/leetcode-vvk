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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;

        int len = 0;
        ListNode temp = head;
        ListNode demo = head;
        ListNode end = head;

        while(end.next != null){
            end = end.next;
            len++;
        }
        len++;

        k = k % len;
        if(k == 0) return head;

        len -= k;

        int i = 1;
        while(i < len){
            temp = temp.next;
            i++;
        }

        demo = temp.next;
        temp.next = null;
        end.next = head;

        return demo;
    }
}