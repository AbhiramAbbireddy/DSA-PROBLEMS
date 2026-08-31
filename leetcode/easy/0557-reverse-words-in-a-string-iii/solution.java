class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++) {
            str.append(new StringBuilder(arr[i]).reverse().toString());
            if(i!=arr.length-1) str.append(" ");
        }
        return str.toString();
    }
}