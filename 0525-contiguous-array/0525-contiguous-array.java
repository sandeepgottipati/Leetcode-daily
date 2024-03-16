class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        int maxLength=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum-=1;
            }
            else{
                sum+=1;
            }
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
            else{
                maxLength=Math.max(i-hm.get(sum),maxLength);
            }
        }
        return maxLength==Integer.MIN_VALUE?0:maxLength;
    }
}
