class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        char[] str=s.toCharArray();
        for(char ch:str){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                if(!st.isEmpty()){
                    if(ch==')' && st.peek()=='(' || ch=='}' && st.peek()=='{' || ch==']' && st.peek()=='['){
                        st.pop();
                    }else{
                        return false;
                    }
                    
                }else if(st.isEmpty()){
                    return false;
                }

                
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}