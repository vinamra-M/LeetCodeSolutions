class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // Edge case: empty list or list with one node
        }

        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
            prev.next = slow.next; // Remove the middle node (for even-sized lists)


        return head;
    }
}
