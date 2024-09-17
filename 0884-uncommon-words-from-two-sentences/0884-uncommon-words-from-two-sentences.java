class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer>map=new HashMap<>();
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");

        for(String str:str1){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str:str2){
            if(map.containsKey(str)){
                int tem=map.getOrDefault(str,0);
                if(tem==1 || tem==-1){
                    map.put(str,-1);
                }
            }else{
                map.put(str,map.getOrDefault(str,0)+1);

            }
        } 
        List<String>list=new ArrayList<>();
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        System.out.print(list);
        int k=0;
        String[] ans=new String[list.size()];
        for(String str:list){
            ans[k++]=str;
        }
        return ans;
    }
}