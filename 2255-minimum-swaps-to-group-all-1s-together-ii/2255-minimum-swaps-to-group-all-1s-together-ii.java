class Solution {
    public int minSwaps(int[] nums) {
        int count=0;
        for(int x:nums){
            if(x==1)count++;
        }
       
        
        int countOfOnes=0;
        for(int i=0;i<count;i++){
            countOfOnes+=nums[i];
        }
        int n=nums.length;
        int min=count-countOfOnes;
        for(int i=0;i<n;i++){
            countOfOnes-=nums[i];
            countOfOnes+=nums[(i+count)%n];
            min=Math.min(min,count-countOfOnes);
        }
        return min;
    }
}