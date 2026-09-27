class Solution {
    public String reverseParentheses(String s) {
        Stack<String>st=new Stack<>();
        String current="";
        for(char ch:s.toCharArray())
        {
           if(ch=='(')
           {
            st.push(current);
            current="";
           }
           else if(ch==')')
           {
            current=new StringBuilder(current).reverse().toString();
            String previous=st.pop();
            current=previous+current;
           }
           else
           {
            current+=ch;
           }
        }
        return current;
    }
}