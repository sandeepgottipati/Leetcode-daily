class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int arr[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=convert(nums[i],mapping);

        }
        Arrays.sort(arr,(a,b)->{
            return a[1]-b[1];
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i][0];
            
        }
        return nums;
    }
    private int convert(int num,int [] mapping){
        String numStr=String.valueOf(num);
        int target=0;
        for(char c:numStr.toCharArray()){
            target+=(target*10)+mapping[c-'0'];
        }
        return target;
    }

}