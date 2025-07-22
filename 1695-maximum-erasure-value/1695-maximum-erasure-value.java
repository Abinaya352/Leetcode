class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i,j,n=nums.length,max=0,sum=0;
       // int[] temp=new int[n];
        int left=0,right=0;
        HashSet<Integer>set=new HashSet<>();
        while(right<n){
            if(set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
                
            }else{
                set.add(nums[right]);
                sum+=nums[right];
                right++;
                if(max<sum){
                    max=sum;
                }
            }
        }
        return max;
    }
}