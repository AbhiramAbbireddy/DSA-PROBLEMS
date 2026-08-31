class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(char c: num.toCharArray()) {
            while(!st.isEmpty() && k>0 && c<st.peek()) {
                st.pop();
                k--;
            } 
            st.push(c);
        }
        while(k>0) {
            st.pop();
            k--;
        }
        StringBuilder str=new StringBuilder();
        for(char c: st) str.append(c);
        String res=str.toString().replaceFirst("^0+","");
        return res.isEmpty()?"0":res;
    }
}