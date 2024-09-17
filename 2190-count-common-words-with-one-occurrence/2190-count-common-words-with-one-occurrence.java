class Solution {
    public int countWords(String[] words1, String[] words2) {
        int i,j;
        Map<String,Integer>map1=new HashMap<>();
        Map<String,Integer>map2=new HashMap<>();
        for(String str:words1){
            map1.put(str,map1.getOrDefault(str,0)+1);
        }
         for(String str:words2){
            if(map1.containsKey(str)){
                int freq=map1.get(str);
                if(freq==1){
                    map1.put(str,0);
                }else{
                    map1.remove(str);
                    //map1.put(str,map1.getOrDefault(str,0)+1);
                }
            }
        }
        int ans=0;
        for(int t:map1.values()){
            if(t==0){
                ans++;
            }
        }
        return ans;
        
    }
}