class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> match=new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            for(int j=0;j<words.length;j++) {
                if(i==j) continue;

                if(words[i].length()<words[j].length() &&
                words[j].contains(words[i])) {
                    match.add(words[i]);
                    break;
                }
            }
        }
        return match;
    }
}