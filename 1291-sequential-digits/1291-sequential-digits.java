class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<9;i++){
            int curr=i;
            for(int j=i+1;j<10;j++){
                curr=curr*10+j;
                if(curr>=low && curr<=high){
                    res.add(curr);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}