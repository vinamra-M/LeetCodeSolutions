class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        
        int index = count - n;
        if (index == 0) {
            return head.next;
        }
        
        ListNode update = head;
        index--;
        while (index > 0) {
            update = update.next;
            index--;
        }
        
        update.next = update.next.next;
        return head;
    }
}
