class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1){
            return n;
        }
        List<Integer> arrList=new ArrayList();
        for(int i=1;i<=n;i++){
            arrList.add(i);
        }
        int currIndex=0;
        while(arrList.size()>1){
                int indexToRemove=(currIndex+k-1)%arrList.size();
                arrList.remove(indexToRemove);
                currIndex=indexToRemove;
        }
        return arrList.get(0);
    }
}
// 