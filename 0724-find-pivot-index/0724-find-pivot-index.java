class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int i,j,n=nums.length;
        for(int t:nums){
            sum+=t;
        }
        int rem=0;
        for(i=0;i<n;i++){
            sum-=nums[i];
            
            if(sum==rem){
                return i;
            }
            rem+=nums[i];
            
            
            
        }
        return -1;
    }
}