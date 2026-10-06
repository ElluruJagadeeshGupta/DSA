class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack();
        st.push(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(0);
            }
            else
            {
                int top=st.pop();
                int A=Math.max(2*top,1);
                int B=st.pop();
                int C=A+B;
                st.push(C);
            }
        }
        return st.pop();
    }
}