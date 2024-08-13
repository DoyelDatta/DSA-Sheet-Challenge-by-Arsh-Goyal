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
    public boolean isPalindrome(ListNode head) {
        int[] arr=new int[100000];
        int size=0;
        while(head!=null)
        {
            arr[size++]=head.val;
            head=head.next;
        }
        int s=size/2;
        for(int i=0;i<s;i++)
        {
            if(arr[i]!=arr[--size]) return false;
        }
        return true;
    }
}
