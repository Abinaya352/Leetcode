class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j,n=nums.length;
        int[] answer=new int[2];
        Map<Integer,Integer>map=new HashMap<>();
        for(i=0;i<n;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }else{
                    map.put(nums[i],i);
            }
            
        } 
        return nums;
        
    }
}