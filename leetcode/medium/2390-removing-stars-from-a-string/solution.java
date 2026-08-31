class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()) {
            if(c=='*') {
                if(stack.isEmpty()) return "";
                stack.pop();
            } else stack.push(c);
        }
        StringBuilder str=new StringBuilder();
        for(char c: stack)
            str.append(c);
        return str.toString();
    }
}