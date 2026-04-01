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
        Set<ListNode> in = new HashSet<>();
        ListNode res = head;
        while (res != null){
            if (in.contains(res)) return true;
            in.add(res);
            res = res.next;
        }

        return false;
    }
}
