class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int number:nums){
            sum+=number;
        }
        int total=(n+(n+1)/2);
        return total-sum;
        
    }
}