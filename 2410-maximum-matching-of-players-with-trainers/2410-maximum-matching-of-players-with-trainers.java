class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i=0,j=0,p=players.length,t=trainers.length,c=0;
        //HashSet<Integer> set=new HashSet<>();
        Arrays.sort(players);
        Arrays.sort(trainers);
         
        while(i<p &&j< t){
            if(players[i]<=trainers[j]){
                i++;
                j++;
                c++;
            }else{
                j++;
            }
        }
        return c;

        
    }
}