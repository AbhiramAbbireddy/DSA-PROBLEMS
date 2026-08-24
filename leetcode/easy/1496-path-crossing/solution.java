class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set=new HashSet<>();
        set.add("0,0");
        int x=0,y=0;
        for(char c: path.toCharArray()) {
            if(c=='N') y+=1;
            else if(c=='E') x+=1;
            else if(c=='W') x-=1;
            else y-=1;
            String curr=x+","+y;
            if(set.contains(curr)) return true;
            set.add(curr);
        }
        return false;
    }
}