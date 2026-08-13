class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set=new HashSet<>();
        for(String s: emails) {
            String[] part=s.split("@");
            String local=part[0],global=part[1];
            int plus=local.indexOf('+');
            if(plus!=-1)
                local=local.substring(0,plus);
            local=local.replace(".","");
            set.add(local+"@"+global);
        }
        return set.size();
    }
}