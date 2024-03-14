class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return helper(nums,goal)-helper(nums,goal-1);
    }
    private int helper(int []nums,int goal){
        int result=0;
        int sum=0;
        int pointerOne=0;
        int pointerTwo=0;
        while(pointerOne<nums.length){
        sum+=nums[pointerOne++];
            while(sum>goal && pointerTwo<pointerOne){
                sum-=nums[pointerTwo];
                pointerTwo++;
            }
            result+=pointerOne-pointerTwo+1;
            
            
        }
        return result;
    }
}