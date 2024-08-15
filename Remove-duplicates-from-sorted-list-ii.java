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
        if(head==null || head.next==null)
        return head;
        ListNode t=head.next;
        if(t.val==head.val)
        {
            while(t!=null && t.val==head.val)
            {
                t=t.next;
            }
            return deleteDuplicates(t);
        }
        else
        {
            head.next=deleteDuplicates(t);
            return head;
        } 
    }
}
