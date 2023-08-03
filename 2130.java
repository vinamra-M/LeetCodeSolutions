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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while( curr != null){
            int a = curr.val;
            list.add(a);
            curr = curr.next;
        }
        int n = list.size();
        int max = 0;
        int s = 0;
        int e = n-1;
        while(s < e){
            int sum = list.get(s)+list.get(e);
            max = Math.max(sum,max);
            s++;
            e--;
        }
        return max;
    }
}
