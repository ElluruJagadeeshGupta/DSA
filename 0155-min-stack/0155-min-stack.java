class MinStack {
   Stack<Integer> st=new Stack();
   Stack<Integer>minStack=new Stack();
    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);
        if(minStack.isEmpty() || value <=minStack.peek())
        {
            minStack.push(value);
        }
    }
    
    public void pop() {
        if(st.peek().equals(minStack.peek()))
        {
            st.pop();
            minStack.pop();
        }
        else
        {
            st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */