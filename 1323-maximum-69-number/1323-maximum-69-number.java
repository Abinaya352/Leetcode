class Solution {
    public int maximum69Number (int num) {
        String str=num+"";
        System.out.print(str);
        int max=num,i,j,l=str.length();
        //char[] s=str.toCharArray();
        for(i=0;i<l;i++){
            char[] s=str.toCharArray();
            if(s[i]=='6'){
                s[i]='9';
            }else{
                 s[i]='6';
            }
            String temp=new String(s);
            int t=Integer.parseInt(temp);
            if(t>max){
                max=t;
            }
        }
        return max;
        
    }
}