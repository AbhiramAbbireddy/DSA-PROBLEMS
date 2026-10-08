class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(char c: s.toCharArray()) {
            if(c=='(') {
                if(!st.isEmpty()) 
                    str.append(c);
                st.push(c);
            } else {
                st.pop();
                if(!st.isEmpty())
                    str.append(c);
            }
        }
        return str.toString();
    }
}