class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int min=nums[0],max=nums[1];
        boolean[] vis=new boolean[101];
        for(int i=0;i<nums.length;i++) {
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
            vis[nums[i]]=true;
        }
        for(int i=min;i<max;i++) {
            if(!vis[i]) list.add(i);
        }
        return list;
    }
}