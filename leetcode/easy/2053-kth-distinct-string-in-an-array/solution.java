class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> freq=new LinkedHashMap<>();
        for(String str: arr)
            freq.put(str,freq.getOrDefault(str,0)+1);
        for(String key: freq.keySet()) {
            if(freq.get(key)==1) {
                k--;
                if(k==0) return key;
            }
        }
        return "";
    }
}