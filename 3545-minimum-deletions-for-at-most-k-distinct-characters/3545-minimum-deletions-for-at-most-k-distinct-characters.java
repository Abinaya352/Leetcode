class Solution {
    public int minDeletion(String s, int k) {
        // HashSet<Character>set=new HashSet<>();
        // int c=0;
        // for(char ch:s.toCharArray()){
        //     if(!set.contains(ch)){
        //         set.add(ch);
        //         c++;
        //     }
        // }
        // if(c<=k){
        //     
        // }
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(map.values());
        Collections.sort(list);
        int del=0,dis=map.size();
        for(int t:list){
            if(dis>k){
                del+=t;
                dis--;
            }else{
                break;
            }
        }

        System.out.print(list);
        return del;
        
    }
}