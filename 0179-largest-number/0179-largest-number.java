class Solution {
    public String largestNumber(int[] nums) {
        int i,j,n=nums.length;
        String[] arr=new String[n];
        for(i=0;i<n;i++){
            arr[i]=nums[i]+"";
        }
        String ans="";
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if((arr[j+1]+arr[j]).compareTo(arr[j]+arr[j])>0){
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        if(arr[0].equals("0")){
            System.out.print("yes");
            return "0";
        }
        return String.join("", arr);
        
    }
}