class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int min=nums[0],max=nums[1];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
            set.add(nums[i]);
        }
        for(int i=min;i<=max;i++) {
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}