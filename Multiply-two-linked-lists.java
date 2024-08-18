/*Node is defined as
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/
class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        int MOD=1000000007;
        long n1=0,n2=0;
        while(first!=null)
        {
            n1=(n1*10+first.data)%MOD;
            first=first.next;
        }
         while(second!=null)
        {
            n2=(n2*10+second.data)%MOD;
            second=second.next;
        }
        return (n1*n2)%MOD;
    }
}
