class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);
        ListNode oddTail = oddDummy; 
        ListNode evenTail = evenDummy; 
        ListNode current = head;

        while (current != null) {
            if (current.val % 2 != 0) {
                oddTail.next = current;
                oddTail = oddTail.next;
            } else {
                evenTail.next = current;
                evenTail = evenTail.next;
            }
            current = current.next;
        }

       
        oddTail.next = evenDummy.next;
        evenTail.next = null;

        return oddDummy.next;
    }
}
