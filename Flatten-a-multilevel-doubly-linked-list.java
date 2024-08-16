/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node p=head;
        while(p!=null)
        {
            if(p.child==null)
            {
                p=p.next;
                continue;
            }
            Node t=p.child;
            while(t.next!=null)t=t.next;
            t.next=p.next;
            if(p.next!=null)
            {
                p.next.prev=t;
            }
            p.next=p.child;
            p.child.prev=p;
            p.child=null;
        }
        return head;
    }
}
