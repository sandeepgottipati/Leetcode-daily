class Solution {
    static List<Integer> res;
    static int dp[];
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        dp=new int[nums.length+1];
        res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.fill(dp,-1);
        helper(nums,curr,0,1);
        return res;
    }
     void helper (int nums[],List<Integer>curr,int index,int prev){
        if(index>=nums.length){
            if(curr.size()>res.size()){
                res.clear();
                res.addAll(curr);
            }
            return;
        }

        if(curr.size() >dp[index] && (nums[index]%prev==0 || prev%nums[index]==0)){
            dp[index]=curr.size();
            curr.add(nums[index]);
            helper(nums,curr,index+1,nums[index]);
            curr.remove(curr.size()-1);
        }
        helper(nums,curr,index+1,prev);
    }
}