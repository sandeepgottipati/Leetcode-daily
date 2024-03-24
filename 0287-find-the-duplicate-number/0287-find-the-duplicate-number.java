class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int x:nums){
            if(hs.contains(x)){
                return x;
            }
            else{
            hs.add(x);    
            }
            
        }
        return -1;
    }
}