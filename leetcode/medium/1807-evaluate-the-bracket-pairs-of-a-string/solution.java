class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder str=new StringBuilder();
        Map<String,String> map=new HashMap<>();
        for(List<String> k: knowledge) 
            map.put(k.get(0),k.get(1));
        int i=0;
        for(i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c=='(') {
                StringBuilder temp=new StringBuilder();
                while(s.charAt(++i)!=')') temp.append(s.charAt(i));
                if(map.get(temp.toString())==null) str.append("?");
                else str.append(map.get(temp.toString()));
            } else str.append(c);
        }
        return str.toString();
    }
}