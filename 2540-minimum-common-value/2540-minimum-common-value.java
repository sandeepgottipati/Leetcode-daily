class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
            int startOne=0;
            int startTwo=0;
            while(startOne<nums1.length && startTwo<nums2.length){
                
                if(nums1[startOne]==nums2[startTwo]){
                    return nums1[startOne];
                }
                if(nums1[startOne]>nums2[startTwo]){
                    startTwo++;
                }
                else{
                    startOne++;
                }
            }
        return -1;
    }
}