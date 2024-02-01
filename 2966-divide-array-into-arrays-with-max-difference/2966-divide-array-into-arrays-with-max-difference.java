class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][]res=new int[nums.length/3][3];
        int ind=0;
        for(int i=0;i<nums.length;i+=3){
                if(nums[i+2]-nums[i]<=k){
                    res[ind][0]=nums[i];
                    res[ind][1]=nums[i+1];
                    res[ind][2]=nums[i+2];
                    ind++;
                }
                else{
                    return new int[0][0];
                }
        }
        return res;
    }
}

// can i sort 
// 1,1,2,2,4,5,7,8,9
// sliding window
// 1,2,3,3,7
// since we need a fixed size we can use the solution like. because our window is constant.