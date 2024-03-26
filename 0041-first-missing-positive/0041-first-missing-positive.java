class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int index=nums[i]-1;
          if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[index]){
              int temp=nums[i];
              nums[i]=nums[index];
              nums[index]=temp;
          }
            else{
                i++;
            }
        }
        i=0;
        while(i<nums.length && nums[i]==i+1)i++;
        return i+1;
    }
}