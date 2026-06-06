
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevLeft = dummy;
        ListNode cur = head;
        for(int i = 0;i< left - 1;i++){
            prevLeft = cur;
            cur = cur.next;
        }
        ListNode prev = null;
        for(int i = 0; i < right - left + 1; i++){
            ListNode tempLeft = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tempLeft;
        }
        prevLeft.next.next = cur;
        prevLeft.next = prev;
        return dummy.next;
    }
}