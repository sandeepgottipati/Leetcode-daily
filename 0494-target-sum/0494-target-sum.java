class Solution {
    HashMap<String,Integer> memo;
    public int findTargetSumWays(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }
        
        memo=new HashMap<>();
        return findTargetSumWays(nums,target,0,0);
    
        
        
    }
    int findTargetSumWays(int []nums,int target,int index,int currsum){
    if(currsum==target && index==nums.length){
            return 1;
        }
        if(index==nums.length){
            return 0;
        }
        String key=generateKey(currsum,index);
        if(memo.containsKey(key)){
            return memo.get(key);
        }
       
        int plus=findTargetSumWays(nums,target,index+1,currsum+nums[index]);
        int minus=findTargetSumWays(nums,target,index+1,currsum+ -nums[index]);
        memo.put(key, plus+minus);
        return memo.get(key);
    }
    private String generateKey(int currsum,int currindex){
        return currsum+","+currindex;
    }
}