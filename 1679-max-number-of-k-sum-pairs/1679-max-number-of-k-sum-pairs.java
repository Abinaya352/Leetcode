class Solution {
    public int maxOperations(int[] nums, int k) {
        int i,j,left=0,right=nums.length-1,n=nums.length,ans=0;
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        while(left<right){
            if(nums[left]+nums[right]==k){
                ans++;
                left++;
                right--;
            }else{
                //int dif=k-nums[right];
                right--;
            }
        }
        return ans;
    }
}