class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,length=0;
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>2) {
                char d=s.charAt(left);
                map.put(d,map.get(d)-1);
                if(map.get(d)==0) map.remove(d);
                left++;
            }
            length=Math.max(length,i-left+1);
        }
        return length;
    }
}