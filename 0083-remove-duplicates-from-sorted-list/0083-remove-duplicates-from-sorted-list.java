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
    public ListNode deleteDuplicates(ListNode head) {
          HashSet<Integer> set=new HashSet<Integer>();
        while(head!=null){
            set.add(head.val);
            head=head.next;
        }
      List<Integer> list=new ArrayList<Integer>(set);
      Collections.sort(list);
      ListNode dummy=new ListNode();
      ListNode temp=dummy;
      for(int i=0;i<list.size();i++){
      ListNode Head=new ListNode(list.get(i));
     dummy.next=Head;
     dummy=dummy.next;
      }
      return temp.next;
   
    }
    }
