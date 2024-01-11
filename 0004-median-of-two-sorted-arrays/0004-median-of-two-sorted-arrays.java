class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length<nums1.length){return findMedianSortedArrays(nums2,nums1);}
        int n1=nums1.length;
        int n2=nums2.length;
        int start=0;
        int end=n1;
        while(start<=end){
            int midOne=start+(end-start)/2;
            int midTwo=(n1+n2)/2-midOne;
            int maxLeft=midOne==0?Integer.MIN_VALUE:nums1[midOne-1];
            int maxRight=midTwo==0?Integer.MIN_VALUE:nums2[midTwo-1];
            int minLeft=midOne==n1?Integer.MAX_VALUE:nums1[midOne];
            int minRight=midTwo==n2?Integer.MAX_VALUE:nums2[midTwo];
            
            if(maxLeft<=minRight && maxRight<=minLeft){
                if((n1+n2)%2==0){
                    return (double) (Math.max(maxRight,maxLeft)+Math.min(minRight,minLeft))/2;
                    
                }
                else{
                    return (double)Math.min(minLeft,minRight);
                }
            }
            else if(maxLeft>minRight){
                 end=midOne-1;
             
            }
            else{
                start=midOne+1;  
            }
        }       
        return -1;
    }
}
