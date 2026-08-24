class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<3;i++) {
            char c=num.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String ans="";
        if(map.size()==1) ans=num.substring(0,3);
        for(int i=1;i<=n-3;i++) {
            char a=num.charAt(i-1),b=num.charAt(i+2);
            map.put(a,map.get(a)-1);
            if(map.get(a)==0) map.remove(a);
            map.put(b,map.getOrDefault(b,0)+1);
            if(map.size()==1) {
                String curr=num.substring(i,i+3);
                if(ans.equals("") || curr.compareTo(ans)>0) ans=curr;
            }
        }
        return ans;
    }
}