class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>>map=new HashMap<>();
        int i,j,n=grid.length,ans=0;
        for(i=0;i<n;i++){
            ArrayList<Integer>list=new ArrayList<>();
            for(j=0;j<n;j++){
                list.add(grid[i][j]);
            }
           map.put(list,map.getOrDefault(list,0)+1);

        }
        for(j=0;j<n;j++){
            ArrayList<Integer>list=new ArrayList<>();
            for(i=0;i<n;i++){
                list.add(grid[i][j]);
            }
            ans+=map.getOrDefault(list,0);
        }

        //System.out.print(set);
        return ans;
        
    }
}