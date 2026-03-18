class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int r=grid.length,c=grid[0].length,i,j,count=0;
        int[][] prefix= new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(i>0 && j>0){
                
                
                    grid[i][j]=grid[i][j]+grid[i-1][j]-grid[i-1][j-1]+grid[i][j-1];
                }else if(i==0 && j!=0){
                    grid[i][j]=grid[i][j]+grid[i][j-1];
                }else if(j==0 && i!=0){
                    grid[i][j]=grid[i][j]+grid[i-1][j];
                }
            }
        }

        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(grid[i][j]<=k){
                    count++;
                }
            }
        }
        return count;
    }
}