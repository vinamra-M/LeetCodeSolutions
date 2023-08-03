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
    public ListNode oddEvenList(ListNode head) {
        ListNode evenStart = null, evenEnd = null, oddEnd = null, oddStart = null;
        int index = 0;
        ListNode curr = head;

        while(curr != null){
            index++;
            if(index % 2 == 1){
                if(oddStart == null){
                    oddStart = curr;
                    oddEnd = curr;
                }
                else{
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }
            else{
                if(evenStart == null){
                    evenStart = curr;
                    evenEnd = curr;
                }
                else{
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            }
            curr = curr.next;
        }
        if(oddStart == null || evenStart == null) return head;
        oddEnd.next = evenStart;
        evenEnd.next = null;
        return head;       
    }
}
