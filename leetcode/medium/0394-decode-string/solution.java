class Solution {
    public String decodeString(String s) {
        Stack<Integer> st=new Stack<>();
        Stack<StringBuilder> str=new Stack<>();
        StringBuilder res=new StringBuilder();
        int num=0;
        for(char c: s.toCharArray()) {
            if(Character.isDigit(c)) num=num*10+(c-'0');
            else if(c=='[') {
                st.push(num);
                str.push(res);
                num=0;
                res=new StringBuilder();
            } else if(c==']') {
                int rep=st.pop();
                StringBuilder prev=str.pop();
                for(int i=0;i<rep;i++)  prev.append(res);
                res=prev;
            } else res.append(c);
        }
        return res.toString();
    }
}