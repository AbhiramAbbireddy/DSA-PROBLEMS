class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        if(n>=0) arr1.add(nums[0]);
        if(n>=1) arr2.add(nums[1]);
        for(int i=2;i<n;i++) {
            int last1=arr1.get(arr1.size()-1);
            int last2=arr2.get(arr2.size()-1);
            if(last1>last2) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }
        int[] res=new int[n];
        int k=0;
        for(int i=0;i<arr1.size();i++)
            res[k++]=arr1.get(i);
        for(int i=0;i<arr2.size();i++)
            res[k++]=arr2.get(i);
        return res; 
    }
}