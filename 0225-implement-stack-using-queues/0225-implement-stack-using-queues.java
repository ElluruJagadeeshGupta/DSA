import java.util.*;

class MyStack {
    Queue<Integer> st = new LinkedList<>();

    public MyStack() {
    }

    public void push(int x) {
        st.offer(x);

        int size = st.size();

        for (int i = 0; i < size - 1; i++) {
            st.offer(st.poll());
        }
    }

    public int pop() {
        return st.poll();
    }

    public int top() {
        return st.peek();
    }

    public boolean empty() {
        return st.isEmpty();
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