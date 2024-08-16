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
    public ListNode partition(ListNode head, int x) {
        ListNode smalllist=new ListNode(0);
        ListNode biglist=new ListNode(0);
        ListNode s=smalllist;
        ListNode b=biglist;
        while(head!=null)
        {
            if(head.val<x)
            {
                s.next=head;
                s=s.next;
            }
            else{
                b.next=head;
                b=b.next;
            }
            head=head.next;
        }
        s.next=biglist.next;
        b.next=null;
        return smalllist.next;
    }
}
