class Solution {
    public boolean isAnagram(String s, String t) {
        int[] num=new int[26];
        for(char ch:s.toCharArray()){
            num[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            num[ch-'a']--;
        }
        for(int n:num){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}