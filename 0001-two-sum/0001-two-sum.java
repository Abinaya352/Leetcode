class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] ans=new int[2];
       int i,j,n=nums.length;
       Map<Integer,Integer> map= new HashMap<>();
       for(i=0;i<n;i++){
            int t=(target-nums[i]);
            if(map.containsKey(t)){
                ans[0]=map.get(t);
                ans[1]=i;
                return ans;
            }else{
                map.put(nums[i],i);
            }
       }
       return ans;
        
    }
}