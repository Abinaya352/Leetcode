class Solution {
    public int maxSubArray(int[] nums) {
        int i,j,n=nums.length,max=Integer.MIN_VALUE,sum=0;
        for(i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
        
    }
}