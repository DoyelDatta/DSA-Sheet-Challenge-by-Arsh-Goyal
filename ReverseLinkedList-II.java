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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right)
        {
            return head;
        }
        ListNode n=new ListNode(0);
        n.next=head;
        ListNode prev=n;
        for(int i=0;i<left-1;i++)
        {
            prev=prev.next;
        }
        ListNode curr=prev.next;
        for(int i=0;i<right-left;i++)
        {
            ListNode forw=curr.next;
            curr.next=forw.next;
            forw.next=prev.next;
            prev.next=forw;
        }
        return n.next;
    }
}
