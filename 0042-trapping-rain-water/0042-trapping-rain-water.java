class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int res=0;
        while(left<=right){
            if(leftMax<rightMax){
                res+=Math.max(leftMax-height[left],0);
                leftMax=Math.max(leftMax,height[left]);
                left++;
            }
            else{
 res+=Math.max(rightMax-height[right],0);
                rightMax=Math.max(rightMax,height[right]);
                right--;
            }
        }
        return res;
    }
}

/**
    int left[]=new int[height.length];
            int maxLeft=0;
            for(int i=0;i<height.length;i++){
                if(maxLeft<height[i]){
                    maxLeft=height[i];
                }
                left[i]=maxLeft;
            }
            int right[]=new int[height.length];
            int maxRight=0;
            for(int i=height.length-1;i>=0;i--){
                if(maxRight<height[i]){
                    maxRight=height[i];
                }
                right[i]=maxRight;

            }
            
            int res=0;
            for(int i=0;i<height.length;i++){
                res+=Math.min(left[i],right[i])-height[i];
            }
return res;






 */