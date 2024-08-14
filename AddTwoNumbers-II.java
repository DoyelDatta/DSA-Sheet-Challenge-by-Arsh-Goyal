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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        while(l1!=null){
            st1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            st2.push(l2.val);
            l2=l2.next;
        }
        ListNode head=null;
        int c=0;
        while(!st1.isEmpty() || !st2.isEmpty() || c!=0)
        {
            int val1;
            if(st1.isEmpty())
            {
                 val1=0;
            }
            else val1=st1.pop();
            int val2;
            if(st2.isEmpty())
            {
                val2=0;
            }
            else val2=st2.pop();
            int t=val1+val2+c;
            c=t/10;
            ListNode n=new ListNode(t%10);
            n.next=head;
            head=n;
        }
        return head;
    }
}
