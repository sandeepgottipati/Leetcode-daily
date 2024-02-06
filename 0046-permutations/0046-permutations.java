class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        helper(res,new ArrayList<>(),nums);
        return res;
    }
    void helper(List<List<Integer>> res,List<Integer>currlist,int[]nums){
        if(currlist.size()==nums.length){
            res.add(new ArrayList<>(currlist));
        }
        else{
             for(int i=0;i<nums.length;i++){
                    if(currlist.contains(nums[i])) continue;
                 currlist.add(nums[i]);
                 helper(res,currlist,nums);
                 currlist.remove(currlist.size()-1);
                    
        }     
        }
       
    }
}