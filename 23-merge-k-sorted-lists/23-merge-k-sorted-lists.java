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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        PriorityQueue<ListNode> pq = new PriorityQueue<>((n1,n2) -> n1.val - n2.val);
        for(ListNode list : lists) {
            if(list != null) {
            pq.add(list);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(!pq.isEmpty()) {
           ListNode top = pq.poll();
           prev.next = top;
            prev = top;
            if(top.next != null) {
                pq.add(top.next);
            }
            
        }
        return dummy.next;
    }
}