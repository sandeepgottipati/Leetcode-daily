class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int []losses=new int[100001];
        for(int i=0;i<matches.length;i++){
            int loss=matches[i][1];
            int win=matches[i][0];
                
                if(losses[win]==0){
                    losses[win]=-1;
                }
                 if(losses[loss]==-1){
                    losses[loss]=1;
                }
                else{
                    losses[loss]++;
                }
            
        }
        List<Integer> zeroloss=new ArrayList<>();
        List<Integer> oneloss=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<losses.length;i++){
            if(losses[i]==-1){
                zeroloss.add(i);
            }
            else if(losses[i]==1){
                oneloss.add(i);
            }
        }
        result.add(zeroloss);
        result.add(oneloss);
        return result;
    }
    
}