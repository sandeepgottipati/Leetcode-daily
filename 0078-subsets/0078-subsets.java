class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();
        helper(new ArrayList<>(),0,nums);
        return res;
    }
    void helper(List<Integer> curr,int index,int[]nums){
        if(index==nums.length){
            res.add(new ArrayList<>(curr));
          return;
        }
        curr.add(nums[index]);
        helper(curr,index+1,nums);
        curr.remove(curr.size()-1);
        helper(curr,index+1,nums);
        
    }
}