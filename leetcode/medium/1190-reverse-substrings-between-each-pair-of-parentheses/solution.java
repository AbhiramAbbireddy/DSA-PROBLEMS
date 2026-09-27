class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char c : s.toCharArray()) {
            if(c==')') {
                StringBuilder t=new StringBuilder();
                while(st.peek()!='(') t.append(st.pop());
                st.pop();
                for(char ch: t.toString().toCharArray()) st.push(ch);
            } else st.push(c);
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()) res.append(st.pop());
        return res.reverse().toString();
    }
}