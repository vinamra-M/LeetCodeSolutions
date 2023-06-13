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
 import java.lang.Math.*;
class Solution {
    public int getDecimalValue(ListNode head) {
        int length = 0;

        ListNode dummy = head;

        while(dummy != null){
            length+=1;
            dummy = dummy.next;
        }
        System.out.println(length);
        
        int ans = 0;
        ListNode temp = head;

        while(temp != null){
            int p = (int)Math.pow(2,length-1);
            ans+= temp.val*p;
            length-=1;
            temp = temp.next;
        }
        return ans;
    }
}
