class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length==0)return new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        helper(res,new ArrayList<Integer>(),candidates,target,0);
        return res;
    }
    private void helper(List<List<Integer>>res, List<Integer>temp,int []arr,int target,int start){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return ;
        }
        else if(target<0){
            return ;
        }
        else{
            for(int i=start;i<arr.length;i++){
                if(i!=start && arr[i]==arr[i-1]){
                    continue;
                }
                temp.add(arr[i]);
                helper(res,temp,arr,target-arr[i],i+1);
                temp.remove(temp.size()-1);

            }
        }
    }
}