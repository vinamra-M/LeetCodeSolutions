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
    public ListNode swapPairs(ListNode head) {
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode ans = new ListNode(-1);
        if(head == null) return head;
        if(head.next == null) return head;
        ans.next = head.next;
        ListNode curr =prev;
        while(curr.next != null && curr.next.next != null){
            curr = curr.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = curr;
            // curr = curr.next;
            prev = prev.next.next;
        }
        return ans.next;
    }
}
