class Solution {
    public int splitNum(int num) {
        String str=num+"";
        int i,l=str.length();
        StringBuilder n1=new StringBuilder();
         StringBuilder n2=new StringBuilder();
        char[] n=str.toCharArray();
        Arrays.sort(n);
        for(i=0;i<l;i++){
            if(i%2==0){
                n1.append(n[i]);
            }else{
                n2.append(n[i]);
            }
        }
        return Integer.parseInt(n1.toString()) + Integer.parseInt(n2.toString());
        
    }
}