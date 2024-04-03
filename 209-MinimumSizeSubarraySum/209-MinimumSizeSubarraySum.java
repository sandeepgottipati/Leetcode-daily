class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int res=Integer.MAX_VALUE;
        int currSum=0;
        while(right<nums.length){
                currSum+=nums[right];
                    if(currSum>=target){
                while(currSum>=target && left<=right){
                    currSum-=nums[left];
                
                        res=Math.min(right-left+1,res);
                    
                    left++;


                }
        }
               
                right++;

        }
        return res==Integer.MAX_VALUE?0:res;
        
7
