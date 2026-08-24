class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        char firstChar=arr[0].charAt(0);
        char lastChar=arr[0].charAt(arr[0].length()-1);
        for(int i=1;i<arr.length;i++) {
            char first=arr[i].charAt(0);
            if(first!=lastChar) return false;
            lastChar=arr[i].charAt(arr[i].length()-1);
        }
        return firstChar==lastChar?true:false;
    }
}