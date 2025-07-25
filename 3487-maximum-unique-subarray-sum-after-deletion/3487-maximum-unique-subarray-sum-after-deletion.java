class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int i,j,n=nums.length,max=0,p=0,z=0,ne=0;
        for(i=0;i<n;i++){
            set.add(nums[i]);
            if(nums[i]<0){
                ne=1;
            }else if(nums[i]==0){
                z=1;
            }else{
                p=1;
                
            }

        }
        if(p==0 && ne==1){
            ArrayList<Integer>list=new ArrayList<>(set);
            Collections.sort(list);
            return list.get(list.size()-1);
        }
        else {
            for(int t:set){
                if(t<0){
                    continue;
                }else{
                    max+=t;
                }
            }
        }
        return max;
        
    }
}