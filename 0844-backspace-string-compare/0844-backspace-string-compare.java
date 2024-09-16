class Solution {
    public String backspace(String str){
        Stack<Character>st=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='#'){
                if(!st.isEmpty()){
                 st.pop();   
                }
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();

    }
    public boolean backspaceCompare(String s, String t) {
        String str1=backspace(s);
        String str2=backspace(t);
        if(str1.length()!=str2.length()){
            return false;
        }
        if(str1.equals(str2)){
            return true;
        }
        return false;

        
    }
}