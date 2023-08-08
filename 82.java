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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode curr = head;
        while(curr != null){
            int a = curr.val;
            map.put(a,map.getOrDefault(a,0)+1);
            curr = curr.next;
        }
        curr = head;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(curr != null) {
            if(map.get(curr.val) == 1){
                tail.next = curr;
                tail = tail.next;
            }
            curr = curr.next;
        }
        if(tail.next != null) tail.next = null;
        return dummy.next;

        // THIS CODE WORKS GOOD BUT ORDER IS NOT MAINTAINED.
        // for (Map.Entry<Integer, Integer> element : map.entrySet()) {
        //     int a = element.getKey();
        //     int b = element.getValue();
        //     if (b == 1) {
        //         ListNode next = new ListNode(a);
        //         tail.next = next;
        //         tail = tail.next;
        //     }
        // }
        
        // tail.next = null;
        
        // return dummy.next;
    }
}
