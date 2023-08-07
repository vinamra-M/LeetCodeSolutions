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
        if(head == null) return null;
        if(head.next == null) return head;
        int count = 0;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        k = k%count;
        count--;
        while(k-- > 0){
            ListNode jar = head;
            int ror = count;
            ror--;
            while(ror-- > 0) jar = jar.next;
            ListNode next = jar.next;
            jar.next = null;
            next.next = head;
            head = next;
        }
        return head;
    }
}
