class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int i,j,l=s.length(),c=0;
        
        char ch=s.charAt(0);
        sb.append(ch);
        for(i=1;i<l;i++){
            if(ch==s.charAt(i)){
                if(c==2){
                    // c=0;
                    continue;
                }
                c=2;
                ch=s.charAt(i);
                 sb.append(ch);
            }else{
                c=0;
                ch=s.charAt(i);
                 sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}