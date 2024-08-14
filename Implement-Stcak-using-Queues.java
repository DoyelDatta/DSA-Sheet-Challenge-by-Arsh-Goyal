class MyStack {
    private Queue<Integer> queue;
    private Queue<Integer> squeue;
    public MyStack() {
       queue=new LinkedList<>();
       squeue=new LinkedList<>();
    }
    
    public void push(int x) {
        while(!queue.isEmpty())
    {
        squeue.add(queue.remove());
    }    
    queue.add(x);
    while(!squeue.isEmpty())
    {
        queue.add(squeue.remove());
    } 
    }
    
    public int pop() {
        if(!queue.isEmpty()) return queue.remove();
        throw new IllegalStateException("Stack is Empty");
    }
    
    public int top() {
        if(!queue.isEmpty()) return queue.peek();
        throw new IllegalStateException("Stack is Empty");
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
