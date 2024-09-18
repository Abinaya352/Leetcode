class Solution {
    public String largestNumber(int[] nums) {
        int i,j,n=nums.length;
        String[] arr=new String[n];
        for(i=0;i<n;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(String str:arr){
            sb.append(str);
        }
        return sb.toString();
        
    }
}