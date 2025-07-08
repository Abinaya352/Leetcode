class Solution {
    public int possibleStringCount(String word) {
        int i,j,n=word.length(),answer=1;
        for(i=1;i<n;i++){
            if(word.charAt(i-1)==word.charAt(i)){
                answer++;
            }
        }
        return answer;

        
    }
}