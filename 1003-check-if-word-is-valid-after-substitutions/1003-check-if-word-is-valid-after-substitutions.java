class Solution {
    public boolean isValid(String s) {
        // String str=s.replaceAll("abc","");
        // System.out.print(str);
        // return false;

        while(s.contains("abc")){
            s=s.replaceAll("abc","");

        }
        if(s.length()==0){
            return true;
        }
        return false;
        
    }
}