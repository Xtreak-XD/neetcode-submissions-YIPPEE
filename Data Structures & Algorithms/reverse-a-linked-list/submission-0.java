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
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ArrayList<Integer> reverse = new ArrayList<>();

        while (head != null){
            reverse.add(head.val);
            head = head.next;
        }

        ListNode reversed = new ListNode();
        ListNode r = reversed;
        for(int i = reverse.size() - 1; i >= 0; i--){
            r.next = new ListNode(reverse.get(i));
            r = r.next;
        }
        return reversed.next;
    }
}
