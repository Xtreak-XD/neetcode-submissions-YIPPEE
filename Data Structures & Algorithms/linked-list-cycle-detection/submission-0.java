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
    public boolean hasCycle(ListNode head) {
        List<Integer> in = new ArrayList<>();
        while (head != null){
            if (in.contains(head.val)) return true;
            in.add(head.val);
            head = head.next;
        }

        return false;
    }
}
