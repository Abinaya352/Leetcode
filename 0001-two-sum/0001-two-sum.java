class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>map=new HashMap<>();
        int i,n=nums.length;
        for(i=0;i<n;i++){
            int diff=nums[i]-target;
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,1};
        
        
    }
}