class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        String ans="";
        int i,j,l=s.length();
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                sb=sb.append(ch);
            }else if(ch=='*'){
                if(sb.length()!=0){
                sb.deleteCharAt(sb.length()-1);
                }

            }else if(ch=='#'){
                sb.append(sb.toString());

            }else if(ch=='%'){
                sb=sb.reverse();

            }
        }



        return sb.toString();
    }
}