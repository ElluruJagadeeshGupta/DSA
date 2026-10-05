class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(!st.isEmpty() && ch==st.peek())
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        String answer="";
        for(char ch : st)
        {
            answer+=ch;
        }
    return answer;
    }
}