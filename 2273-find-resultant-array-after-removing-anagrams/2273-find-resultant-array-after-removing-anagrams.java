class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        String prev="";
        for(String str:words){
            char[] temp=str.toCharArray();
            Arrays.sort(temp);
            String curr=String.valueOf(temp);
            if(!curr.equals(prev)){
                ans.add(str);
                prev=curr;
            }
        }
        return ans;
        
    }
}