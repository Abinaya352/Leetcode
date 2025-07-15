class Solution {
    public boolean isValid(String word) {
        int v=0,c=0;
        if(word.length()<3){
            return false;
        }else{

            for(char ch:word.toCharArray()){
                if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                        v++;
                    }else{
                        c++;
                    }
                }else{
                    if(ch>='0' && ch<='9'){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        if(v!=0 && c!=0){
            return true;
        }
        return false;
    }
}