class Solution {
    List<List<Integer>>list;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list=new ArrayList<>();
        helper(new ArrayList<>(),target,candidates,0);
        return list;
    }
    void helper(List<Integer>res,int target,int arr[],int index){
        if(index>arr.length-1){
return;
        }
      
            if(target==0){
                list.add(new ArrayList<>(res));
                return;
            }
        if(target<0){
            return ;
        }
        res.add(arr[index]);
        helper(res,target-arr[index],arr,index);
        res.remove(res.size()-1);
        helper(res,target,arr,index+1);
        
        
    }
}