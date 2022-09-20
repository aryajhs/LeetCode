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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode resultListNode = new ListNode();    
        ListNode currentListNode = resultListNode;    
        
        while(list1 != null || list2 != null) {
            ListNode nextListNode = new ListNode();   
            
            if(list1 == null) {
                nextListNode.val = list2.val;
                list2 = list2.next;
            } else if(list2 == null) {
                nextListNode.val = list1.val;
                list1 = list1.next;
            } else if(list1.val > list2.val) {
                nextListNode.val = list2.val;
                list2 = list2.next;
            } else {
                nextListNode.val = list1.val;
                list1 = list1.next;
            }
            currentListNode.next = nextListNode;
            currentListNode = nextListNode;
            
        }
        
        
        return resultListNode.next;
    }
}