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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        for(ListNode node : lists){
            if(node == null) continue;
            pq.add(node);
        }
        
        ListNode ans = new ListNode(-1);
        ListNode dumm = ans;
        while(!pq.isEmpty()){
            ListNode curr = pq.poll();
            dumm.next = curr;
            if(curr.next != null) pq.add(curr.next);
            dumm = dumm.next;
        }
        return ans.next;
    }
}
